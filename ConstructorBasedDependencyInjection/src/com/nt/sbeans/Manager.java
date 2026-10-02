package com.nt.sbeans;

import java.util.Map;

public class Manager {
 String mName;
 Map<Employee,Project> ass;
 public Manager(String mName, Map<Employee, Project> ass) {
	super();
	this.mName = mName;
	this.ass = ass;
 }
 public void displayAssignments() {
	 System.out.println("manager Name :"+mName);
	 ass.forEach((x,y)->{
		 x.getEmployeeInfo();
		 y.getProjectInfo();
	 });
 }
}
