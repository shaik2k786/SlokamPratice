package com.basic;

import java.util.Scanner;

public class SwitchStuMark {
	public static void main(String[] args) {

		// Scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st sub Marks");
		int sub1 = scan.nextInt();
		
		System.out.println("enter 2nd sub marks");
		int sub2 = scan.nextInt();
		
		System.out.println("enter 3rd sub marks");
		int sub3 = scan.nextInt();
		
		System.out.println("enter 4th sub marks");
		int sub4 = scan.nextInt();
		
		int total = sub1 + sub2 + sub3 + sub4;
		double avg = (total / 4.0);
		double pers = (total / 400.0) * 100;
		System.out.println(pers);
		switch ((int) pers/10) {
		case 9:
			System.out.println("A+ grade");
			break;
		case 8:
		case 7:
			System.out.println("A Grade");
			break;
		case 6:
		case 5:
			System.out.println("B Grade");
			break;
		case 4:
		case 3:
			System.out.println("pass");

			break;
		default:
			System.out.println("fail");
			break;
		}
	}
}
