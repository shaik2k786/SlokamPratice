package com.basic.interfac1;

public class Hdfc implements LoanBank {

	public static double rot=12;
	
	public double rofint(double amount) {
		// TODO Auto-generated method stub
		return (amount/100)*rot;
	}

}
