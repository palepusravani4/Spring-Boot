package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	}
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	public Optional<Employee> getEmployeeById(Long id){
		return repo.findById(id);
	}
	public Employee updateEmployeeById(Long id,Employee e) {
		Employee e1=repo.findById(id).orElse(null);
		if(id!=null) {
			e1.setName(e.getName());
			e1.setDept(e.getDept());
			e1.setSalary(e.getSalary());
			return repo.save(e1);
		}
		return null;
	}
	public String deleteById(Long id) {
		repo.deleteById(id);
		return "Employeee is deleted successfully with id "+id;
	}

}
