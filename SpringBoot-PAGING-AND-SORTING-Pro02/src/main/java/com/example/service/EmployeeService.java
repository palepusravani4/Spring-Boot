package com.example.service;

import org.springframework.data.domain.Page;

import com.example.entity.Employee;

public interface EmployeeService {
	
public Page<Employee> showEmployeeByPageAndSize(int pageno,int pagesize,boolean asc,String props);
public Iterable<Employee> fetchBySalary(boolean asc,String props);
public Iterable<Employee> fetchByJoining(boolean asc,String props);
public Employee addEmployee(Employee e);

}
