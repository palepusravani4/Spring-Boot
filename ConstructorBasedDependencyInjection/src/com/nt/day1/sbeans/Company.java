package com.nt.day1.sbeans;

import java.util.List;

public class Company {
	List<Department> dept;

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}
	public void showdepartment() {
		for(Department d:dept) {
			d.showdetails();
		}
	}

}
