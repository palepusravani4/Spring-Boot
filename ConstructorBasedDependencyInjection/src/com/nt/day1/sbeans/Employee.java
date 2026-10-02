package com.nt.day1.sbeans;

public class Employee {

	int empid;
	String empname;
	Department dept;
	Address addr;
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void showempdetails() {
		System.out.println("Employee ID: "+empid+", Name: "+empname);
		dept.showdetails();
		addr.showaddress();
	}
}
