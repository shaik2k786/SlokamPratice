package com.basic.arrays;

public class GivenArrayCountEvenNum {

	public static void main(String[] args) {

		int arr[]= {20,60,33,23,12,13,46,67,78};
		int cou=0;
			for(int i=0;i<=arr.length-1;i++) {
				if(arr[i]%2==0) {
					cou++;
					System.out.println(arr[i]);
				}
			}
			System.out.println("number of count:"+cou);
		}
	}


