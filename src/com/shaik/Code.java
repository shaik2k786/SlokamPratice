package com.shaik;

public class Code {

	public static void findPair(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println( nums[i] +" , "+nums[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 8, 6, -1, 4, 11, 9 };
		int target = 10;
		findPair(nums, target);
	}
}
