package com.example.Service;

import java.util.List;

import com.example.Document.Employee;

public interface IEmployeeMgmt {
	
	public List<Employee> showEmployeesByAddrs(List<String> cities);
	 public List<Employee> showEmployeesBySalaryRange(double start, double end);
	 public List<Object[]> fetchEmployeesDataByAddrs(String addr);
	 public List<Employee> fetchEmployeesBySalaryRange(double start, double end);
	 public List<Employee> fetchEmployeesByAddrs(String addrs1, String addrs2);

}
