package com.basic;

public class PalindramNum {
	public static void main(String[] args) {
		int a = 1621;
		int temp = a;
		int rev = 0;
		while (a != 0) {
			int d = a % 10;
			rev = rev * 10 + d;
			a = a / 10;
		}
		if (temp == rev) {
			System.out.println("palindram");
		}

		else {
			System.out.println("not palindrma");

		}
	}
}
