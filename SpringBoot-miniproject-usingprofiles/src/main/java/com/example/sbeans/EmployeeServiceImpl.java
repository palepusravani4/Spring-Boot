package com.example.sbeans;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeesByDesgs(String d1, String d2, String d3) throws Exception {
		List<Employee> list=dao.getEmployeeByDesgs(d1, d2, d3);
		
		list.forEach(emp->{
		emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
		emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});
		
		
		
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		int result=dao.inserEmployee(emp);
		return result==0?"Employee not registred":"Emloyee is registred successfully";
	}

}
