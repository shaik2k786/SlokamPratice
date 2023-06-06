package com.basic.arrays;

public class GivenArrayPrint60And80Between {
	public static void main(String[] args) {
		int arr[]= {20,60,70,97,79,88,69};
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>=60 && arr[i]<=80) {
				count++;
			}
		}
		System.out.println(count);
	}
}
