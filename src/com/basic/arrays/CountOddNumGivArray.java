package com.basic.arrays;

public class CountOddNumGivArray {
public static void main(String[] args) {
	int arr[] = {10,20,40,69,77,99,10};
	int count=0;
	
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]%2!=0) {
			count++;
		}
	}
	System.out.println(count);
}
}
