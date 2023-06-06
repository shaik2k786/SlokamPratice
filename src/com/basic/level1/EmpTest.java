package com.basic.level1;

public class EmpTest {
public static void main(String[] args) {
	
	EmpDep D = new EmpDep(101, "IT","HYD");
	
	
	
	Emp E = new Emp(1,"Siva",1234.76,D);
	
	System.out.println(E.getEid()+"--"+E.getEname()+"--"+E.getEsal());
	
	EmpDep d=E.getdesg();
	System.out.println(d.getDid()+"---"+d.getDname()+"---"+d.getDloc());
	
}
}
