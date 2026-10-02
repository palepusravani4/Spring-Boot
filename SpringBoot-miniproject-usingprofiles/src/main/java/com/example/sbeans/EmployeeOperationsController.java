package com.example.sbeans;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeService service;
	public List<Employee> showAllEmployeesByDesgs(String d1,String d2,String d3)throws Exception{
	List<Employee> list=service.fetchAllEmployeesByDesgs(d1, d2, d3);
	return list;
	}
	public String processEmployee(Employee emp) throws Exception {
		String msg=service.registerEmployee(emp);
		return msg;
	}
	

}
