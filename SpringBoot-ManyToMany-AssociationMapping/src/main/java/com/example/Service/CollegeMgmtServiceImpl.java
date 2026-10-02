package com.example.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Faculty;
import com.example.Entity.Student;
import com.example.Repository.IFacultyRepository;
import com.example.Repository.IStudentRepository;
@Service
public class CollegeMgmtServiceImpl implements ICollegeMgmtService{
    @Autowired
	IFacultyRepository frepo;
    @Autowired
	IStudentRepository srepo;
	@Override
	public String saveFacultyAndHisStudents(List<Faculty> f) {
	   List<Faculty> ft=frepo.saveAll(f);
	   List<Integer> id=ft.stream().map(Faculty::getFid).collect(Collectors.toList());
	   
		return id.size()+" no of faculties are saved with id values "+id;
	}
	@Override
	public String saveStudentAndTheirFaculties(List<Student> s) {
		 List<Student> st=srepo.saveAll(s);
		   List<Integer> id=st.stream().map(Student::getSid).collect(Collectors.toList());
		   
			return id.size()+" no of students are saved with id values "+id;
		}
}
