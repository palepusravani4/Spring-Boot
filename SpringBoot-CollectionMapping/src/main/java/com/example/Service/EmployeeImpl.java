package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.EmployeeRepository;
@Service
public class EmployeeImpl implements IEmployee{
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public String registerEmployee(Employee e) {
		
		 int id = repo.save(e).getEid();
		 return "Employee is saved with id value "+id;
		 
	}

	@Override
	public List<Employee> showAllEmployees() {

		return repo.findAll();
	}

	@Override
	public String showEmployeeById(int id) {
		 Optional<Employee> byId = repo.findById(id);
		 if(byId.isPresent()) {
			 return "Employee is found with id "+byId;
		 }else {
			 return "Employee is not found";
		 }
	}

}
