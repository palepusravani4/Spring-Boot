package com.example.Service;

import java.util.List;

import com.example.Entity.Faculty;
import com.example.Entity.Student;

public interface ICollegeMgmtService {
	
	public String saveFacultyAndHisStudents(List<Faculty> f);
	
	public String saveStudentAndTheirFaculties(List<Student> s);
	

}
