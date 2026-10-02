package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Faculty;
import com.example.Entity.Student;
import com.example.Service.ICollegeMgmtService;
@Component
public class ManyToManyTestRunner implements CommandLineRunner{
	@Autowired
	private ICollegeMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Faculty f1=new Faculty("Nataraz","hyd");
			Faculty f2=new Faculty("RaviShankar","Rajastan");
			Faculty f3=new Faculty("VijayKumar","Vizg");
			
			Student s1=new Student("priya","ong","shdc");
			Student s2=new Student("satya","kakinada","svsc");
			Student s3=new Student("deepthi","vijayawada","rvsjc");
			f1.getStudent().add(s1);f1.getStudent().add(s2);f1.getStudent().add(s3);
			f2.getStudent().add(s1);f2.getStudent().add(s2);f2.getStudent().add(s3);
			f3.getStudent().add(s1);f3.getStudent().add(s2);f3.getStudent().add(s3);
			
			s1.getFaculty().add(f1);s1.getFaculty().add(f2);s1.getFaculty().add(f3);
			s2.getFaculty().add(f1);s2.getFaculty().add(f2);s2.getFaculty().add(f3);
			s3.getFaculty().add(f1);s3.getFaculty().add(f2);s3.getFaculty().add(f3);
			
			String msg1=service.saveFacultyAndHisStudents(List.of(f1,f2,f3));
			String msg2=service.saveStudentAndTheirFaculties(List.of(s1,s2,s3));
			System.out.println(msg1);
		System.out.println("--------------------");
		System.out.println(msg2);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
