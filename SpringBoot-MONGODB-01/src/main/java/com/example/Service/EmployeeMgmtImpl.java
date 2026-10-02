package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Document.Employee;
import com.example.Repository.IEmployeeRepository;
@Service
public class EmployeeMgmtImpl implements IEmployeeMgmtService {
        @Autowired
	    IEmployeeRepository repo;
	@Override
	public String saveEmployee(Employee emp) {
		String idVal = repo.save(emp).getId();
		return "Employee id saved with id value "+idVal;
	}

	@Override
	public Iterable<Employee> showAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public String showEmployeeById(String id) {
		Optional<Employee> byId = repo.findById(id);
		if(byId.isPresent()) {
			return byId.get().toString();
		}else {
		return "Employee is not found";
		}
	}

	@Override
	public String updateEmployeeSalary(String id, double hikeper) {
		Optional<Employee> byId = repo.findById(id);
		if(byId.isPresent()) {
			Employee emp=byId.get();
			emp.setSalary(emp.getSalary()+emp.getSalary()*hikeper/100.0);
		     repo.save(emp);
		     return "Employee salary is updated";
		
		}
		
		return "Employee not found with the given "+id;
	}

	@Override
	public String deleteEmployeeByIds(List<String> id) {
		List<Employee> emp=repo.findAllById(id);
		if(emp.size()!=0) {
			repo.deleteAllById(id);
			return "Employee records are deleted";
		}
		return "Employee records are not found";
	}

}
