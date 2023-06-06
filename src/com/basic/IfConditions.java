package com.basic;

import java.util.Scanner;

public class IfConditions {
	public static void main(String[] args) {
		int a = 21;
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
   
		
		// Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
