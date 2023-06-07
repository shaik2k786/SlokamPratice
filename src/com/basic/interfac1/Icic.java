package com.basic.interfac1;

public class Icic implements LoanBank{
 
	public static double rot=10;

	public double rofint(double amount) {
		return  (amount/100)*rot;
	}
}
