package com.basic.level1;

public class Emp {
	private int eid;
	private String ename;
	private double esal;
	private EmpDep desg;
	
	public Emp(int eid, String ename, double esal, EmpDep desg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.desg = desg;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public EmpDep getdesg() {
		return desg;
	}

	public void setdesg(EmpDep desg) {
		this.desg = desg;
	}

	
}
