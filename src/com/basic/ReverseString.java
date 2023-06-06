package com.basic;

public class ReverseString {
public static void main(String[] args) {
	String s="shaik saida";
	for(int i=s.length()-1;i>=0;i=i-1) {
		System.out.print(s.charAt(i));
	}
}
}
