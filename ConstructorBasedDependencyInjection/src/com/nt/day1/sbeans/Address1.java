package com.nt.day1.sbeans;

public class Address1 {

	String deptname;
	int deptid;
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public void display() {
		System.out.println("Department ID: "+deptid+", Name: "+deptname);
	}
}
