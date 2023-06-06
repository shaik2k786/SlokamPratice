package com.basic.interfac;

public class TestInterface {
	public static void main(String[] args) {

		Bank b=new PerLone();
		b.doc();
		b.rofint();
		System.out.println("=================================");

		Bank b1=new EdLone();
		b1.doc();
		b1.rofint();
		System.out.println("=================================");

		Bank b2=new AgriLone();
		b2.doc();
		b2.rofint();
		System.out.println("=================================");

	}
}
