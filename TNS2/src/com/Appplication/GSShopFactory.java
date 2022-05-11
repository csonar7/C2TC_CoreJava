package com.Appplication;

import com.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNO, String accName, float charges, boolean isPrime) {
		GSPrimeAcc gspa=new GSPrimeAcc(accNO, accName, charges, isPrime);
		
		return gspa;
	}

	@Override
	public GSNormalAcc getNormalAcc(int accNO, String accName, float charges) {
		GSNormalAcc gsna=new GSNormalAcc(accNO, accName, charges);
		return gsna;
	}

	
	
	
	
	
	
	
}
