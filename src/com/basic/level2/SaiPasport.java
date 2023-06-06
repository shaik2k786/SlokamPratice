package com.basic.level2;

public class SaiPasport {

	private int pasid;
	private String name;
	private char gender;
	public SaiPasport(int pasid, String name, char gender) {
		super();
		this.pasid = pasid;
		this.name = name;
		this.gender = gender;
	}
	public int getPasid() {
		return pasid;
	}
	public void setPasid(int pasid) {
		this.pasid = pasid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
