package com.shaik;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("size:" + v.size());
		System.out.println("initial capacity:" + v.capacity());
		for (int i = 1; i <= 100; i++) {
			v.add(i);
		}
		
		System.out.println("after 10 insertions size:" + v.size());
		System.out.println("after 10 insertion,capacity:" + v.capacity());
		
	}

}
