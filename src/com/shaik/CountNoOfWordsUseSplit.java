package com.shaik;

public class CountNoOfWordsUseSplit {

	public static void main(String[] args) {
      String line="this is core java class";
      String []arr=line.split("");
      System.out.println("letter count:"+arr.length);
      System.out.println("words are:");
      for(String ele:arr) {
    	  System.out.print(ele);
      }
	}
}
