package com.basic.interfac1;

import java.util.Scanner;

public class LoanBankTest {
	public static void main(String[] args) {

		LoanBank l;
		l = new Hdfc();
		double s = l.rofint(12000);
		System.out.println(s);
		System.out.println("========================");
		l = new Sbi();
		double d = l.rofint(2100);
		System.out.println(d);
		System.out.println("============================");
		l = new Icic();
		double d1 = l.rofint(4210);
		System.out.println(d1);

		System.out.println("=======================");
		
		
		// Scanner class

		
		Scanner scan = new Scanner(System.in);
		LoanBank l1;

		System.out.println("Enter HDFC  amount");
		l1 = new Hdfc();
		double d3 = scan.nextDouble();
		double s1 = l1.rofint(d3);
		System.out.println(d3 + ":loan amount");
		System.out.println(s1 + ":interst amount");

		System.out.println("Enter Sib Amount ");
		l1 = new Sbi();
		double d4 = scan.nextDouble();
		double s2 = l1.rofint(d4);
		System.out.println(d4 + ":Loan amount");
		System.out.println(s2 + ":interst amount");

		System.out.println("Enter Icic Amount ");
		l1 = new Icic();
		double d5 = scan.nextDouble();
		double s3 = l1.rofint(d5);
		System.out.println(d5 + ":Loan amount");
		System.out.println(s3 + ":interst amount");

	}
}
