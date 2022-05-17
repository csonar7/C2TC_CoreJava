package com.framework;

public interface BankFactory {
	
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal,boolean isSalary);
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal,float creLmt);

}
