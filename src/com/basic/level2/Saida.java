package com.basic.level2;

public class Saida {
private int sid;
private String sname;
private String sage;
private long pnum;
private Smobile [] mob;
public Saida(int sid, String sname, String sage, long pnum, Smobile[] mob) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sage = sage;
	this.pnum = pnum;
	this.mob = mob;
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
public String getSage() {
	return sage;
}
public void setSage(String sage) {
	this.sage = sage;
}
public long getPnum() {
	return pnum;
}
public void setPnum(long pnum) {
	this.pnum = pnum;
}
public Smobile[] getMob() {
	return mob;
}
public void setMob(Smobile[] mob) {
	this.mob = mob;
}

}
