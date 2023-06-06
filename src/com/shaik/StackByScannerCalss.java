package com.shaik;

import java.util.Scanner;
import java.util.Stack;

public class StackByScannerCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>();
		while (true) {
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.display");
			System.out.println("5.quit");
			System.out.println("enter your choise");
			int ch = scan.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter element");
				int ele = scan.nextInt();
				stk.push(ele);
				System.out.println("pushed on stack");
				break;
			case 2:
				if (stk.empty()) {
					System.out.println("stack empty");
				} else {
					System.out.println("pop:" + stk.pop());
				}
				break;
			case 3:
				if (stk.empty()) {
					System.out.println("stack empty");
				} else {
					System.out.println("peek:" + stk.peek());
				}
				break;
			case 4:
				System.out.println("display element");
				System.out.println("stk:" + stk);
				break;
			case 5:
				System.exit(ch);
			default:
				System.out.println("invalid choice");
			}

		}
	}

}
