package com.example.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Student;

import com.example.Service.StudentServiceImpl;
@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	StudentServiceImpl service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Student stu=new Student("priya","hyd",850.0);
			service.registerStudent(stu);
			Student showStudentById = service.showStudentById(100);
			System.out.println(showStudentById);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
