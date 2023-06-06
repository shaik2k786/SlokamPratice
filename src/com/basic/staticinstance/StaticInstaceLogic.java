package com.basic.staticinstance;

public class StaticInstaceLogic {
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		StaticInstaceLogic s=new StaticInstaceLogic();
		System.out.println(s.a+":instance variable");
		System.out.println(b+":static variable");
		System.out.println(s.b+":static variable");
		System.out.println(StaticInstaceLogic.b+":static varisble");

		s.a=12; // Re insilization
		b=12;  // Re insilition
		System.out.println(s.a +":instance ");
		System.out.println(b+":static variable");
		StaticInstaceLogic s1=new StaticInstaceLogic();
		System.out.println(s1.a+":instance variable");
		System.out.println(b+":static variable");
	}
}
