package com.basic;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		int marks=89;
		if(marks>35) {       // only one option
			System.out.println("pass");
		}
		if(marks>35) {        //only two options
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks<=35 && marks<40) {
			System.out.println("pass");
		}
		else if(marks<=40 && marks<60) {
			System.out.println("third Class");
		}
		else if(marks<=60 && marks<80) {
			System.out.println("Second Class");
		}
		else {
			System.out.println("dis");
		}


		//Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter marks");
		int mark=scan.nextInt();
		if(mark<35) {
			System.out.println("fail");
		}
		else if(mark<=35 && mark<40) {
			System.out.println(" pass");
		}
		else if(mark<=40 &&mark<60) {
			System.out.println("Second class");
		}
		else {
			System.out.println("first Class");
		}
	}

}
