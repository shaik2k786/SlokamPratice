package com.basic.multipul.inheri;

import com.basic.inheritiance.Child;

public class Children implements GParent1,Parent1 {

	public void m2() {

		System.out.println("m2 method");
	}

	public void add() {
       System.out.println("add method");		
	}

	public void m1() {

		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		Children c=new Children();
		c.add();
		c.m1();
		c.m2();
		System.out.println(GParent1.a);
		System.out.println(Parent1.a);   
	}

}
