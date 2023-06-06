package com.basic;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		int a=10,b=20,c=a+b;
		System.out.println(c);
		
		
		
		
		// Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int x=scan.nextInt();
		System.out.println("Enter second Number");
		int y=scan.nextInt();
		int z=x+y;
		System.out.println(z);
	}
}
