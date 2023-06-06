package com.basic;

public class ifCondition {
	public static void main(String[] args) {

		int mark = 38;
		if (mark < 35) {
			System.out.println("fail");
		}
		else if (mark > 35 && mark <= 40) {
			System.out.println("pass");
		}
		else if (mark > 40 && mark <= 70) {
			System.out.println("A Greade");
		} 
		else {
			System.out.println("distince");
		}
	}
}
