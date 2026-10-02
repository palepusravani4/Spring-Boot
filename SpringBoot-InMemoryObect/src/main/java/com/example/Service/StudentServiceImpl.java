package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudent {
	@Autowired
	private IStudentRepository repo;

	@Override
	public Student registerStudent(Student stu) {
		
		return repo.save(stu);
	}

	@Override
	public Student showStudentById(int id) {
        return  repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		
	}

	@Override
	public List<Student> showAllStudents() {
		
		return repo.findAll();
	}

}
