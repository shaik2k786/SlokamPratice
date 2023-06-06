package com.basic;

import java.util.Arrays;

public class StringAnagaram {
public static void main(String[] args) {
	String s1="shaik";
	String s2="sha";
	char [] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	boolean result=Arrays.equals(arr1, arr2);
	System.out.println();
	if(result) {
		System.out.println(s1+" and "+s2+"are anagaram");
	}
	else {
		System.out.println(s1+" Are not anagaram "+s2);
	}
	
}
}
