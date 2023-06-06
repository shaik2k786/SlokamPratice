package com.shaik;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReading {

	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter emp detalis");
			int id = Integer.parseInt(br.readLine());
			String name = br.readLine();
			double salary = Double.parseDouble(br.readLine());
			System.out.println("details:" + id + "," + name + "," + salary);
		} finally {
			if (br == null) {
				br.close();
			}
		}
	}

}
