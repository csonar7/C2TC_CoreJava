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
		GSPrimeAcc pa=gssf.getNewPrimeAcc(112233, "Chetan", 9.65f, true);
		System.out.println(pa);
		
		
		
//		gssf.getNormalAcc(1021, "Sonu", 15.35f);
//		String s=gssf.toString();
//		System.out.println(s);
//		GSPrimeAcc gspa=new GSPrimeAcc();
//		gspa.toString();
		
		
		NormalAcc na=gssf.getNormalAcc(1021, "Sonu", 15.35f);
		System.out.println(na);
		
		
		
		
		/*GSPrimeAcc gspa=new GSPrimeAcc(112233, "hhh", 2.336f, false);
		System.out.println(gspa.getAccName());
		System.out.println(gspa.getAccNO());
		System.out.println(gspa.getCharges());
		System.out.println(gspa.isPrime());
		
		gspa.isPrime();
		*/
	}

}
