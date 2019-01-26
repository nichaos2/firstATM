package test;

import model.ATM;
import service.MoneyDispatcher;

public class ATMRunner {

	public static void main(String[] args) {
	
	int withdrawAmount = 60;
	ATM atm = new ATM(2,5);
	System.out.println("* Initial money " + atm.getTotalAmount() );
	
	MoneyDispatcher moneyDispatcher = new MoneyDispatcher();
	atm = moneyDispatcher.dispatchMoney(atm, withdrawAmount);
	
	
	
	int newAmount = atm.getTotalAmount();
	
	System.out.println("* " + moneyDispatcher.getMessage());
	System.out.println("** The new amount of the atm is "  +  newAmount);
	System.out.println("** It contains " + atm.getNbrOfFifties() + " fifties and ");
	System.out.println("** It contains " + atm.getNbrOfTwenties() + " twenties");
	}
}
