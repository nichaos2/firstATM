package service;

import model.ATM;

public class MoneyDispatcher implements IMoneyDispatcher{
	
	private static boolean success = false;
	private static String message = "";

	@Override
	public ATM dispatchMoney(ATM atm, int amount) {
		
		int initNbrOfTwenties = atm.getNbrOfTwenties();
		int initNbrOfFifties = atm.getNbrOfFifties();
		
		// TODO amount larger than available
		
		int nbrOfFifties = dispatchFifties(amount);
		amount -= nbrOfFifties*50;
		int nbrOfTwenties = dispatchTweenties(amount);

		return new ATM(initNbrOfTwenties- nbrOfTwenties, initNbrOfFifties - nbrOfFifties);
	}
	
	private int dispatchTweenties(int amount) {
		//
		int nbrOfTwenties = amount/20;
		
		// TODO if there are still money to be given => false
		setSuccess(true);

		setMessage(getMessage() + "and " + nbrOfTwenties + " 20's");
		return nbrOfTwenties;
	}

	private int dispatchFifties(int amount) {
		//
		int nbrOfFifties = amount/50;
		setSuccess(true);
		setMessage("You get " + nbrOfFifties + " 50's");
		return nbrOfFifties;
	}

	public static boolean isSuccess() {
		return success;
	}

	public static void setSuccess(boolean success) {
		MoneyDispatcher.success = success;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		MoneyDispatcher.message = message;
	}

}
