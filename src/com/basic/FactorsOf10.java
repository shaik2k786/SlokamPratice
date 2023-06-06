package com.basic;

import java.util.Scanner;

public class FactorsOf10 {
public static void main(String[] args) {
	for(int i=1;i<=10;i=i+1) {
		if(10%i==0) {
			System.out.println(i);
		}
	}
	//Scanner Class
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scan.nextInt();
	for(int i=1;i<=num;i=i+1) {
		if(num%i==0) {
			System.out.println(i);
		}
	}
	//count the even number in scanner class
	Scanner san=new Scanner(System.in);
	System.out.println("enter a number");
	int count=0;
	int n=scan.nextInt();
	for(int i=1;i<=n;i=i+1) {
		if(n%i==0) {
			count=count+1;
		}
	}
	System.out.println(count+":Count Of Even Number");
}
}
