package com.basic.interfac1;

import java.util.Scanner;

import com.basic.interfac.Bipc;
import com.basic.interfac.Cec;
import com.basic.interfac.Mpc;

public class TestInterClg {
	public static void main(String[] args) {

		//Scanner class

		Scanner scan=new Scanner(System.in);
		System.out.println("plz enter the group");
		String group=scan.next();
		System.out.println("enter a group");
		String cou=scan.next();
		System.out.println("enter fee");
		double fee=scan.nextDouble();

		
          InterClg i;
          
		if(group.equals("mpc")) {
			i=new Mpc1();
			String s=i.group(cou);
			double d=i.fee (fee);
			System.out.println(d+":fee");
			System.out.println(s+":Course");
		}
		else if(group.equals("bipc")) {
			i=new Bipc1();
			i.group(cou);
			i.fee(fee);
		}
		else if(group.equals("cec")) {
			i=new Cec1();
			i.group(cou);
			i.fee(fee);
		}
		else {
			System.out.println("plz select the group");
		}
	}

}
