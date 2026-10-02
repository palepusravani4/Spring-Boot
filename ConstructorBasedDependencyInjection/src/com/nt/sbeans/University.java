package com.nt.sbeans;

import java.util.List;

public class University {
	String uniName;
	List<Student> students;
	public University(String uniName, List<Student> students) {
		super();
		this.uniName = uniName;
		this.students = students;
	}
	public void displayUniversityData() {
		System.out.println("Unifersity name"+uniName);
		for(Student s:students) {
			s.showStudentDetails();
		}
	}

}
