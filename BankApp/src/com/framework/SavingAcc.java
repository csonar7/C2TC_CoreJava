package com.framework;

public class SavingAcc extends BankAcc{
	private boolean isSalary;
	public SavingAcc() 
	{
		
	}

	public SavingAcc(int accNo, String accName, float accBal,boolean isSalary) 
	{
		super(accNo, accName, accBal);
		this.isSalary = isSalary;	
	}

	@Override
	public void withdraw(float a) 
	{
		
		System.out.println("Your cash is withdraw successfully with Amount = "+a);
		
	}

	@Override
	public String toString() 
	{
		return super.toString()+"SavingAcc [isSalary=" + isSalary + "]";
	}
	
	

}
