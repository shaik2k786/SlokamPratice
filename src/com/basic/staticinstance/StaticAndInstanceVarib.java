package com.basic.staticinstance;

public class StaticAndInstanceVarib {
  
	public int a=10;
	public static int b=40;
	public void m1() {
		System.out.println("M1 is a instance variable");
	}
	public static void m2() {
		System.out.println("M2 is a static variable ");
	}
	public static void main(String[] args) {
		StaticAndInstanceVarib s=new StaticAndInstanceVarib();  // obj creation of instance variables
		System.out.println(s.a+":instance variable");
		s.m1();
		System.out.println(b+":static variable");
		m2();
	}
}
