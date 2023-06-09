package com.basic.overriding;

public class OverridingChild extends OverridingPerent {

	public void m3() {
		System.out.println("Child m3 method");
	}

	public void m4() {
		System.out.println("Child m4 method");
	}

	public static void main(String[] args) {
		OverridingChild c = new OverridingChild();
		c.m1();
		c.m2();
		c.m3();
		c.m4();

	}
}
