package com.basic;

import java.util.Scanner;

public class EvenNumLogin {
	public static void main(String[] args) {
		for(int i=1;i<=10;i=i+1) {
			if(i%2==0) {
				System.err.println(i);
			}
		}
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
		//Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i=i+1) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
