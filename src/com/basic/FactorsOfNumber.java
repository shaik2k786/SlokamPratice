package com.basic;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
        int num=17;
        for(int i=1;i<=num;i=i+1) {
        	if(num%i==0) {
        		System.out.println(i);
        	}
        }
        // scanner class
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scan.nextInt();
        for(int i=1;i<=n;i=i+1) {
        	if(n%i==0) {
        		System.out.println(i);
        	}
        }
		
	}

}
