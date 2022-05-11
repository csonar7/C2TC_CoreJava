package com.Start;

import java.util.ArrayList;

import com.Appplication.GSNormalAcc;
import com.Appplication.GSPrimeAcc;
import com.Appplication.GSShopFactory;
import com.framework.NormalAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory gssf=new GSShopFactory();
		gssf.getNewPrimeAcc(112233, "Chetan", 9.65f, true);
		gssf.getNormalAcc(1021, "Sonu", 15.35f);
		gssf.toString();
		GSPrimeAcc gspa=new GSPrimeAcc();
		gspa.toString();
		
		NormalAcc na=new NormalAcc(1021, "Sonu", 15.35f);
		na.toString();
		
		
		
		
		
		/*GSPrimeAcc gspa=new GSPrimeAcc(112233, "hhh", 2.336f, false);
		System.out.println(gspa.getAccName());
		System.out.println(gspa.getAccNO());
		System.out.println(gspa.getCharges());
		System.out.println(gspa.isPrime());
		
		gspa.isPrime();
		*/
	}

}
