package com.Appplication;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{


	
	public GSNormalAcc(int accNO, String accName, float charges) {
		super(accNO, accName, charges);
		
	}
	public void bookProduct(float charg)
	{
		
	}
	@Override
	public String toString() {
		
		return super.getAccName()+super.getAccNO()+super.getCharges()+super.getDerivarycharge();
	}
}
