package com.example.Service;

import java.util.List;

import com.example.Document.Employee;

public interface IEmployeeMgmtService {
	
	public String saveEmployee(Employee emp);
	public Iterable<Employee> showAllEmployees();
	public String showEmployeeById(String id);
	public String updateEmployeeSalary(String id,double hikeper);
	public String deleteEmployeeByIds(List<String> id);

}
