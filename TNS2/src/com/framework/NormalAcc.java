package com.framework;

public class NormalAcc extends ShopAcc{

	private final float derivarycharge=50.36f;
	
	public NormalAcc()
	{
		
	}
	public NormalAcc(int accNO, String accName, float charges)
	{
		super();
		
	}
	
	public float getDerivarycharge() {
		return derivarycharge;
	}

	public void bookProduct(float charge)
	{
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"NormalAcc [derivarycharge=" + derivarycharge + "]";
	}
	
}
