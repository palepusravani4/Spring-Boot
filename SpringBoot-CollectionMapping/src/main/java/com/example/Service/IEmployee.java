package com.example.Service;

import java.util.List;

import com.example.Entity.Employee;

public interface IEmployee {
	
	public String registerEmployee(Employee e);
	public List<Employee> showAllEmployees();
	public String showEmployeeById(int id);

}
