package com.nt.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.day1.sbeans.Address;
import com.nt.day1.sbeans.Department;
import com.nt.day1.sbeans.Employee;

@Configuration
public class AppConfig1 {
	
	@Bean
	public Department dept() {
		Department d=new Department();
		d.setDeptid(10);
		d.setDeptname("IT");
		return d;
	}
	@Bean
	public Address address() {
		Address a=new Address();
		a.setCity("Pune");
		a.setCountry("India");
		return a;
	}
	@Bean
	public Employee emp() {
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEmpname("Rohit Sharma");
		e.setDept(dept());
		e.setAddr(address());
		return e;
	}

}
