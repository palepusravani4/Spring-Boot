package com.nt.sbeans;

import java.util.List;

public class Department {
String deptname;
List<Manager> managers;
public Department(String deptname, List<Manager> managers) {
	super();
	this.deptname = deptname;
	this.managers = managers;
}
public void showDepartmentData() {
	System.out.println("deparment name"+deptname);
	for(Manager m:managers) {
		m.displayAssignments();
	}
}
}
