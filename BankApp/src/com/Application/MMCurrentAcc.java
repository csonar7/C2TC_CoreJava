package com.Application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc()
	{
		
	}
	public MMCurrentAcc(int accNo, String accName, float accBal,float creLmt)
	{
		super(accNo,accName,accBal,creLmt);
	}
	
	public void withdraw(float a) 
	{
		System.out.println("Your cash is withdraw successfully with Current Amount = "+a);
		
	}
	@Override
	public String toString() {
		return super.toString();
	}
	

}
