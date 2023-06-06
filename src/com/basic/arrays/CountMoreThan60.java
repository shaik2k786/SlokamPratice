package com.basic.arrays;

public class CountMoreThan60 {

	public static void main(String[] args) {

		int []arr= {10,39,60,79,87,90,55,24};
		int cou=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>=60) {
				cou++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("number arrays:"+cou);
	}

}
