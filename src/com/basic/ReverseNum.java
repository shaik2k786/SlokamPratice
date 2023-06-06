package com.basic;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	int n=123123;
	int rev=0;
	while(n!=0) {
		int d=n%10; // last digit
		rev=rev*10+d;
		n=n/10;//with out last digit
	}
	System.out.println(rev);
	
	
	
	//Scanner Class
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int num=scan.nextInt();
	int rev1=0;
	while(num!=0) {
		int d=num%10;
		rev1=rev1*10+d;
		num=num/10;
	}
	System.out.println(rev1);
}
}
