package com.nt.Appconfig;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.day1.sbeans.Company;
import com.nt.day1.sbeans.Department;

@Configuration
public class AppConfig2 {

	@Bean
	public Department dept1() {
		Department d1=new Department();
		d1.setDeptid(101);
		d1.setDeptname("IT");
		return d1;
	}
	@Bean
	public Department dept2() {
		Department d2=new Department();
		d2.setDeptid(102);
		d2.setDeptname("HR");
		return d2;
	}
	@Bean
	public Department dept3() {
		Department d3=new Department();
		d3.setDeptid(103);
		d3.setDeptname("Finance");
		return d3;
	}
	@Bean
	public Company com() {
		
		Company c=new Company();
		c.setDept(Arrays.asList(dept1(),dept2(),dept3()));
		return c;
	}
}
