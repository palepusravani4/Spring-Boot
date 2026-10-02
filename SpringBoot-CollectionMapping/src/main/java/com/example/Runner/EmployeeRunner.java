package com.example.Runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Employee;
import com.example.Service.IEmployee;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	IEmployee service;

	@Override
	public void run(String... args) throws Exception {
		
		Employee e=new Employee("priya","hyd",List.of("siri","harshi","satya"),Set.of(11111111l,2222222l,33333333l),Map.of("adhar","111122233","panno","12345678"));
		service.registerEmployee(e);
		Employee e1=new Employee("riya","hyd",List.of("sri","Bhanu","anu"),Set.of(11111111l,2222222l,33333333l),Map.of("adhar","111122233","panno","12345678"));
		service.registerEmployee(e1);
		
		service.showAllEmployees().forEach(System.out::println);
		service.showEmployeeById(100);
		
		
		
	}

}
