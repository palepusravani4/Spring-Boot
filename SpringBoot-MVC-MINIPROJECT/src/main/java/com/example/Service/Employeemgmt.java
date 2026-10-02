package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.IEmployeeRepository;
@Service
public class Employeemgmt implements IEmployeeMgmtService{
    @Autowired
	private IEmployeeRepository service;
	@Override
	public Iterable<Employee> getAllEmployee() {
		
		return service.findAll();
	}
	@Override
	public String registerEmployee(Employee emp) {
		
		return "employee saved with id value :"+service.save(emp).getEmpno();
	}
	

}
