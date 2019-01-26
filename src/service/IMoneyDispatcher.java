package service;

import model.ATM;

public interface IMoneyDispatcher {

	public ATM dispatchMoney(ATM atm, int amount);
	
}
