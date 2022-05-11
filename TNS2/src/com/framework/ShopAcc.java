package com.framework;

public abstract class ShopAcc {

	private int accNO;
	private String accName;
	private float charges;
	
	public ShopAcc()
	{
	}
	public ShopAcc(int accNO, String accName, float charges) {
		this.accNO = accNO;
		this.accName = accName;
		this.charges = charges;
	}
	
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public abstract void bookProduct(float charg);
	
	public void items(float charg)
	{
		float c=charg;
		
	}
	
	
	
	
}
