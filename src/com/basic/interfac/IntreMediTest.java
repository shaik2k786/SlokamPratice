package com.basic.interfac;

import java.util.Scanner;

public class IntreMediTest {
	public static void main(String[] args) {

		InterMediate i;
		Scanner scan=new Scanner(System.in);
		System.out.println("plz enter the group");

		String group=scan.next();

		if(group.equals("mpc")) {
			i=new Mpc();
			i.group();
			i.fee();
		}
		else if(group.equals("bipc")) {
			i=new Bipc();
			i.group();
			i.fee();
		}
		else if(group.equals("cec")) {
			i=new Cec();
			i.group();
			i.fee();
		}
		else {
			System.out.println("plz select the group");
		}
	}
}
