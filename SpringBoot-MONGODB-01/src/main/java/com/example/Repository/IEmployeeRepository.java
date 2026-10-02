package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {

}
