package com.basic.interfac1;

public class Sbi implements LoanBank {
   
	public static double rot=8;
	@Override
	public double rofint(double amount) {
		// TODO Auto-generated method stub
		return (amount/100)*rot;
	}

}
