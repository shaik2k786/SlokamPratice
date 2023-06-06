package com.shaik;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveElementFromTheList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("list is:" + list);
		int index = Collections.binarySearch(list, 30);
		if (index < 100) {
			list.remove(index);
			System.out.println("after removal:" + list);
		} else {
			System.out.println("no such elements to remove");
		}
	}

}
