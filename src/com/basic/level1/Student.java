package com.basic.level1;

public class Student {
	
	private int sid;
	private String sname;
	private double smark;
	private String squal;


	public Student(int sid, String sname, double smark, String squal) {

		this.sid = sid;
		this.sname = sname;
		this.smark = smark;
		this.squal = squal;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public double getSmark() {
		return smark;
	}


	public void setSmark(double smark) {
		this.smark = smark;
	}


	public String getSqual() {
		return squal;
	}


	public void setSqual(String squal) {
		this.squal = squal;
	}



}
