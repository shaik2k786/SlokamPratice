package com.basic.inheritiance;

public class InheriTest {
	public static void main(String[] args) {


		// sub class ref holding the subclass obj
		Child c = new Child();
		c.m1();
		c.m2();
		c.p1();
		c.p2();

		//super class ref holding the super class obj
		Parent r=new Parent();
		r.p1();
		r.p2();
		//sub class ref hold the super class obj
		//sub class ref cannot hold the super class obj
		//parent it big class child is small class
		
		//	Child c1=new Parent();


		//super class ref holding the sub class obj
		//parent is big class child is small class
		//in case child and parent have same methods child class methods will execute
		Parent g=new Child();

		//here p1 method have in both classes parent and child but it execute child class method
		g.p1();

	}
}
