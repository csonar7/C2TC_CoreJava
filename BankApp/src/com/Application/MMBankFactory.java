package com.Application;

import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal,boolean isSalary) {
		SavingAcc sa=new SavingAcc();
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal,float creLmt) {
		CurrentAcc ca=new CurrentAcc();
		return ca;
	}

}
