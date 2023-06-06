package com.basic.staticinstance;

public class StaticBlockOne {
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		StaticBlockTwo t=new StaticBlockTwo();
		
		//StaticBlockOne s=new StaticBlockOne();
		
		System.out.println("hiii");
	}
}
