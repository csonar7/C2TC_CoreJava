package com.AccHolder;

import com.Application.MMBankFactory;
import com.Application.MMCurrentAcc;
import com.Application.MMSavingAcc;
import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankFactory bf=new MMBankFactory();
//		SavingAcc sa=new MMSavingAcc();
//		CurrentAcc ca=new MMCurrentAcc();
		MMBankFactory mbf=new MMBankFactory();
		
		SavingAcc sa=mbf.getNewSavingAccount(11225544, "Chetan", 358000, true);
		System.out.println(sa);
		CurrentAcc ca= mbf.getNewCurrentAccount(88855446, "M S Electrical", 5436000.25f, 1000000);
		System.out.println(ca);
		
		MMSavingAcc mmsa=new MMSavingAcc();
		
		
		mmsa.withdraw(25000);
		
		mmsa.deposite(25000);
		
	}

}
