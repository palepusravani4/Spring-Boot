package com.nt.day1.sbeans;

public class Department {
   int deptid;
   String deptname;
   public void setDeptid(int deptid) {
	this.deptid = deptid;
   }
   public void setDeptname(String deptname) {
	this.deptname = deptname;
   }
   public void showdetails() {
	  System.out.println("Department Id: "+deptid+", Name: "+deptname); 
   }
}
