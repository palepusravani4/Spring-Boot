package com.nt.sbeans;

public class Employee {
  int empId;
  String empName;
  String desi;
  public Employee(int empId, String empName, String desi) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.desi = desi;
  }
  public void getEmployeeInfo() {
	  System.out.println("empid :"+empId);
	  System.out.println("empname :"+empName);
	  System.out.println("emp desi"+desi);
	  
  }

}
