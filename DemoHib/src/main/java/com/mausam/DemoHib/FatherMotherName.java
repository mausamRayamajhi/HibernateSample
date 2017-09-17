package com.mausam.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class FatherMotherName {
	private String fatherName;
	private String motherName;
	public FatherMotherName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FatherMotherName(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "FatherMotherName [fatherName=" + fatherName + ", motherName="
				+ motherName + "]";
	}
	
}
