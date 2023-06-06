package com.basic;

import java.util.Scanner;

public class MethodsBillCal {
	public void add() {
		int items = 3;
		double pric = 400;
		double dis = 10;
		double gst = 20;
		double disv = ((items * pric) / 100) * dis;
		double gstv = ((items * pric) / 100) * gst;
		double bill = (items * pric) + gst - dis;
		System.out.println("dis:" + disv);
		System.out.println("gst:" + gstv);
		System.out.println("total Bill:" + bill);
		System.out.println("+++++++++++++++++++");
	}

	void add(int items, double pric, double dis, double gst) {
		double disv = ((items * pric) / 100) * dis;
		double gstv = ((items * pric) / 100) * gst;
		double bill = (items * pric) + gst - dis;
		System.out.println("dis:" + disv);
		System.out.println("gst:" + gstv);
		System.out.println("total Bill:" + bill);
		System.out.println("===============================");
	}

	public static void main(String[] args) {
		MethodsBillCal mb = new MethodsBillCal();
		mb.add();
		mb.add(3, 400, 10.0, 20.0);

		// scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num Of Items");
		int items = scan.nextInt();
		System.out.println("Enter Item Price");
		double pric = scan.nextDouble();
		System.out.println("Enter Discount");
		double dis = scan.nextDouble();
		System.out.println("Enter Gst");
		double gst = scan.nextDouble();
		double disv = ((items * pric) / 100) * dis;  
		double gstv = ((items * pric) / 100) * gst;
		double bill = (items * pric) + gst - dis;
		System.out.println("dis:" + disv);
		System.out.println("gst:" + gstv);
		System.out.println("total Bill:" + bill);
	}
}
