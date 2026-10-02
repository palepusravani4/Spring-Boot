package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
