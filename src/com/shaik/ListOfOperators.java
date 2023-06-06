package com.shaik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfOperators {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(true) {
        	System.out.println("1.insert");
        	System.out.println("2.search");
        	System.out.println("3.remove");
        	System.out.println("4.print");
        	System.out.println("5.quit");
        	System.out.print("enter a choise");
        	int ch=scan.nextInt();
        	switch(ch) {
     case 1:  System.out.print("enter element");
        	int ele=scan.nextInt();
        	list.add(ele);
        	System.out.println("element inserted");
        	break;
     case 2:  System.out.println("enter element");
            ele=scan.nextInt();
            int index=Collections.binarySearch(list, ele);
            if(index>=0) {
            	System.out.println("found @:"+index);
            }
            else {
            	System.out.println("no such element");
            }
            break;
     case 3:  System.out.println("enter element");
              ele=scan.nextInt();
               index=Collections.binarySearch(list, ele);
              if(index>=0) {
            	  list.remove(index);
            	  System.out.println("after remove :"+list);
            	  
              }
              else {
            	  System.out.println("no such element to remove");
              }
        	
      case 4:   if(list.size()==0) {
    	        System.out.println("list is empty");
      }
         else {
    	  System.out.println("element are:");
    	  for(Integer x:list) {
    		  System.out.println(x);
    	  }
      }
      break;
      case 5:  System.exit(0);
      default :System.out.println("invalid choise");
        }
	}
	}
}
