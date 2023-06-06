package com.basic;

public class Count5multipicationUpTo50 {
	public static void main(String[] args) {
		int num=50;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				count=count+1;
				System.out.println(i);
			}
		}
		System.out.println(count+"count the number of 5th multipicatin");
	}
}
