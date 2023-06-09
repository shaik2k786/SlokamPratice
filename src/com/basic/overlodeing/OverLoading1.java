package com.basic.overlodeing;

public class OverLoading1 {

	public void sub(int a,int b) {
		System.out.println(a+"---"+b);
	}
	public void sub(String a,int b) {
		System.out.println(a+"---"+b);
	}
	public void sub(String a,String b) {
		System.out.println(a+"---"+b);
	}
	public void sub(double a,int b) {
		System.out.println(a+"---"+b);
	}
	 double sub(double a) {
		System.out.println(a);
		return a;
	}
	
	   protected int sub(int b) {
		 System.out.println(b);
		 return b;
	 }
	 
	 final void sub(String a,double b) {
			System.out.println(a+"---"+b);
		}
	 static void sub(String a,int b,int c) {
			System.out.println(a+"---"+b+"---"+c);
		}
	 public static void main(String[] args) {
		OverLoading1 ol=new OverLoading1();
		ol.sub(21);
		ol.sub("shik", 32131);
		ol.sub("shaik", "shaik");
		ol.sub("shaik", 21, 43);
		ol.sub(41, 99);
		ol.sub(3131.2);
		ol.sub(312.2, 3131);
	}
}
