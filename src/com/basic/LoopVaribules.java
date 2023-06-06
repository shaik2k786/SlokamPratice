package com.basic;

public class LoopVaribules {
public static void main(String[] args) {
	for(int i=1;i<=10;i=i+1) {
		int b=1;
		System.out.println(b+":b varibule is in side of the loop");
		b=b+1;
	}
	
	int b=1;
	for(int i=1;i<=10;i=i+1) {
		
		System.out.println(b+": b varibule is out side of the loop");
		b=b+1;
	}
	
	
}
}
