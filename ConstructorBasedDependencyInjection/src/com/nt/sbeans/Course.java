package com.nt.sbeans;

public class Course {
	int courseId;
	String courseName;
	int duration;
	public Course(int courseId, String courseName, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	public void showCourseInfo() {
		System.out.println("course id :"+courseId);
		System.out.println("course name :"+courseName);
		System.out.println("course duration :"+duration);
	}

}
