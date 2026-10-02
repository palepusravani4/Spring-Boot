package com.example.Service;

import java.util.List;


import com.example.Entity.Student;

public interface IStudent {
	
	public Student registerStudent(Student stu);
	public Student showStudentById(int id);
	public List<Student> showAllStudents();

}
