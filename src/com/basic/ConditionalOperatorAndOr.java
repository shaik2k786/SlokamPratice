package com.basic;

public class ConditionalOperatorAndOr {
	public static void main(String[] args) {
		int persent=40;
		int quali=16;

		// AND
		//true and false=false
		//false and false=false
		//true and true=true
		//false and true=false


		//OR
		//true or true=true
		//false or false=false
		//true or false=true
		//false or true=true


		if(((persent>=40 && persent <=60) || quali==16) && quali==15) {
			System.out.println("you are aligible");
		}
		else {
			System.out.println("you are not aligible");
		}
	}
}
