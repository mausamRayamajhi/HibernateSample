package com.mausam.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class AlienFullName {
	private String fname;
	private String lname;
	private String mname;
	private FatherMotherName fmName;
	public AlienFullName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AlienFullName(String fname, String lname, String mname,
			FatherMotherName fmName) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.fmName = fmName;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public FatherMotherName getFmName() {
		return fmName;
	}
	public void setFmName(FatherMotherName fmName) {
		this.fmName = fmName;
	}
	@Override
	public String toString() {
		return "AlienFullName [fname=" + fname + ", lname=" + lname + ", mname="
				+ mname + ", fmName=" + fmName + "]";
	}
	
	
}
