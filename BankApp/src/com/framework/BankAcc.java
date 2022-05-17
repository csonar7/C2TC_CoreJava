package com.framework;

public abstract class BankAcc {

	private int accNo;
	private String accName;
	private float accBal;
	public BankAcc() 
	{

	}
	public BankAcc(int accNo, String accName, float accBal) 
	{
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	public int getAccNo() 
	{
		return accNo;
	}
	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	public String getAccName() 
	{
		return accName;
	}
	public void setAccName(String accName) 
	{
		this.accName = accName;
	}
	public float getAccBal() 
	{
		return accBal;
	}
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}
	
	public abstract void withdraw(float a);
	
	public void deposite(float b)
	{
		System.out.println("Credited By "+b);
	}
	@Override
	public String toString() 
	{
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
	
	
	
	

}
