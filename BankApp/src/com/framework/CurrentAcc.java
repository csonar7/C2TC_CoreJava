package com.framework;

public class CurrentAcc extends BankAcc{
	private float creditLimit;
	
	public CurrentAcc()
	{
		
	}
	
	public CurrentAcc(int accNo, String accName, float accBal,float creLmt) 
	{
		super(accNo, accName, accBal);
		this.creditLimit=creLmt;
	}

	@Override
	public void withdraw(float a) 
	{
		System.out.println("Your cash is withdraw successfully with Current Amount = "+a);
		
	}

	@Override
	public String toString() {
		return super.toString()+"CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
