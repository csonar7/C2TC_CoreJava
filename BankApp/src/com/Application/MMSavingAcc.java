package com.Application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float minbal=1000.00f;
	
	public MMSavingAcc()
	{
		
	}
	
	public MMSavingAcc(int accNo, String accName, float accBal,boolean isSalary)
	{
		super(accNo,accName,accBal,isSalary);
	}
	public void withdraw(float a) 
	{
		System.out.println("Your cash is withdraw successfully with Current Amount = "+a);
		
	}

	@Override
	public String toString() {
		return super.toString()+" minimum balance="+minbal;
	}
	
	
}
