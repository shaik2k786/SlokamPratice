package com.basic.overriding;

public class OverridingChiTest extends OverridingPa {

	public void m3() {
		System.out.println("Child m3 method");
	}

	//final methods we cannot override
	//public final void m4() {
	//System.out.println("Parent m4 method");
	//	}

	//we can override static methods 
	//(we can override the static methods that is called method ) 
	static void m5() {
		System.out.println("child m5 method");
	}

	public static void main(String[] args) {

		OverridingPa ot=new OverridingChiTest();
		ot.m5();

	}

}
