package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.example.Repository.IEmployeeRepository;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	IEmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		try {
	/*List<Employee> multiple = List.of(new Employee(101,"smith","hr",50000.0,"21-11-2012"),
					new Employee(102,"allen","it",60000.0,"21-11-2013"),new Employee(103,"blake","software",70000.0,"21-11-2014"),
					new Employee(104,"ford","developer",80000.0,"21-11-2014"),new Employee(105,"scott","manager",80000.0,"21-11-2015"));
			
			repo.saveAll(multiple);*/
		
			/*repo.findByDepartmentIs("hr").forEach(System.out::println);
			repo.getByDepartmentEquals("developer").forEach(System.out::println);*/
			
			//repo.findBySalaryBetween(5000.0, 60000.0).forEach(System.out::println);
			//repo.findByNameStartingWith("s").forEach(System.out::println);
			//repo.findByNameEndingWith("n").forEach(System.out::println);
			//repo.findByNameContaining("a").forEach(System.out::println);
			//repo.findByDepartmentInOrderByDepartmentDesc(List.of("developer","manager")).forEach(System.out::println);
			repo.findByNameLikeAndSalaryBetween("s%", 5000.0, 60000.0).forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
