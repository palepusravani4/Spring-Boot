package com.nt.sbeans;

import java.util.List;

public class Student {
	int stuId;
	String stuName;
	List<Course> enrolledCourses;
	public Student(int stuId, String stuName, List<Course> enrolledCourses) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.enrolledCourses = enrolledCourses;
	}
	public void showStudentDetails() {
		System.out.println("Student id :"+stuId);
		System.out.println("Student Name :"+stuName);
	   for(Course c:enrolledCourses) {
		   c.showCourseInfo();
	   }
	}

}
