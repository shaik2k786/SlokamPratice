package com.basic.pattern;

import java.util.Scanner;

public class PatternPrintStarts {
	public static void main(String[] args) {
		for(int i=1;i<=5;i=i+1) {

			for(int j=1;j<=5;j=j+1) {

				System.out.println(i+" "+j);
			}
			System.out.println();
		}

		//Scanner Class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i=i+1) {

			for(int j=1;j<=n;j=j+1) {
				System.out.print(i+" "+j);
			}
			System.out.println();
		}
	}
}
