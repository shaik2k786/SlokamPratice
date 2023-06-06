package com.basic.level2;

public class Smobile {
private String mobile;
private long pnumber;
private String sim;
public Smobile(String mobile, long pnumber, String sim) {
	super();
	this.mobile = mobile;
	this.pnumber = pnumber;
	this.sim = sim;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public long getPnumber() {
	return pnumber;
}
public void setPnumber(long pnumber) {
	this.pnumber = pnumber;
}
public String getSim() {
	return sim;
}
public void setSim(String sim) {
	this.sim = sim;
}

}
