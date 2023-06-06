package com.shaik;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
      Stack <Integer> stk= new Stack <Integer>();
      stk.push(10);
      stk.push(20);
      stk.push(30);
      System.out.println("stack"+stk.push(60));
      System.out.println("stack:"+stk);
      System.out.println("pop:"+stk.pop());
      System.out.println("stack:"+stk);
	}

}
