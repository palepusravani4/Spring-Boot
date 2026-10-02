package com.example.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	EmployeeService service;

	@Override
	public void run(String... args) throws Exception {
//		try {
//		Employee e1=new Employee(101,"siri","hr",5000.0,"20-12-2021");
//		Employee e2=new Employee(102,"jhon","it",8000.0,"10-12-2021");
//		Employee e3=new Employee(103,"allen","software",15000.0,"25-12-2021");
//		Employee e4=new Employee(104,"blake","developer",25000.0,"08-12-2021");
//		Employee e5=new Employee(105,"smith","finance",35000.0,"05-12-2021");
//		service.addEmployee(e1);
//		service.addEmployee(e2);
//		service.addEmployee(e3);
//		service.addEmployee(e4);
//		service.addEmployee(e5);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			Iterable<Employee> fetchBySalary = service.fetchBySalary(false, "salary");
//			fetchBySalary.forEach(System.out::println);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		try {
			Iterable<Employee> fetchByJoining = service.fetchByJoining(true, "dateOfJoining");
			fetchByJoining.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
