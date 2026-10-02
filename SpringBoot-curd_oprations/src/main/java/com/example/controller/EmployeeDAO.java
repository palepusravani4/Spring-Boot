package com.example.controller;

import java.util.List;

import com.example.Model.Employee;

public interface EmployeeDAO {
	
   void addEmployee(Employee e)throws Exception;
   Employee getEmployee(int id) throws Exception;
   List<Employee> getAllEmployees() throws Exception;
   void updateEmployee(Employee e) throws Exception;
   void deleteEmployee(int id) throws  Exception;
   
}
