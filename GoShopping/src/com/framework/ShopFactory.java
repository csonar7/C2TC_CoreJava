package com.framework;

import com.Appplication.GSNormalAcc;
import com.Appplication.GSPrimeAcc;

public interface ShopFactory {
	
	public GSPrimeAcc getNewPrimeAcc(int accNO, String accName, float charges,boolean isPrime);
	
	public GSNormalAcc getNormalAcc(int accNO, String accName, float charges);
}
