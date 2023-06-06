package com.basic;

import java.util.Scanner;

public class FindFactorsOfNum {
	public static void main(String[] args) {
		int num=12;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count+":Num Of Factors count");



		//scanner class

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int count1=0;
		int n=scan.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count1++;
			}
		}
		System.out.println(count1+":number Of factors");
	}
}
