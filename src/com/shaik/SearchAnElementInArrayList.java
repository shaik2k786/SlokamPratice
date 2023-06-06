package com.shaik;

import java.util.ArrayList;
import java.util.Collections;

public class SearchAnElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int index = Collections.binarySearch(list, 50);
		if (index >= 0) {
			System.out.println("element found @ index:" + index);
		} else {
			System.out.println("not found");
		}
	}

}
