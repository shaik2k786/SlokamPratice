package com.basic.overlodeing;

public class OverLoading {

	public void add(String un,String pas) {
		System.out.println("un && pas");
	}
	public void add(String un,int otp) {
		System.out.println("un && otp");
	}
	public void add(String un,String q1,String q2) {
		System.out.println("un && q1 && q2");
	}
	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.add("shaik", "saida");
		ol.add("shaik", 123);
		ol.add("shaik", "q1","q2");
	}
}
