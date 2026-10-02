package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
private EmployeeRepository erepo;

	@Override
	public Page<Employee> showEmployeeByPageAndSize(int pageno, int pagesize,boolean asc,String props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Pageable p =  PageRequest.of(pageno, pagesize, sort);
	   
	    
		Page<Employee> p1=erepo.findAll(p);
		return p1;
	}

	@Override
	public Iterable<Employee> fetchBySalary(boolean asc,String props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Iterable<Employee> emp=erepo.findAll(sort);
		return emp;
	}

	@Override
	public Iterable<Employee> fetchByJoining(boolean asc, String props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Iterable<Employee> emp=erepo.findAll(sort);
		
		return emp;
	}

	@Override
	public Employee addEmployee(Employee e) {
		
		return erepo.save(e);
	}
}
