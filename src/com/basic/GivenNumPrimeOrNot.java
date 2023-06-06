package com.basic;

import java.util.Scanner;

public class GivenNumPrimeOrNot {
	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n/i==0) {
				count++;
			}
		}
		if(n==2) {
			System.out.println("is prime number");
		}
		else {
			System.out.println("is not prime number");
		}
		
		//Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int count2=0;
		
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count2++;
			}
		}
		if(num==2) {
			System.out.println("is a prime number");
		}
		else {
			System.out.println("is not a prime number");
		}
	}
}
