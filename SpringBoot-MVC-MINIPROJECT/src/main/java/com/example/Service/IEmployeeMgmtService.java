package com.example.Service;

import com.example.Entity.Employee;

public interface IEmployeeMgmtService {
    
	public Iterable<Employee> getAllEmployee();
    public String registerEmployee(Employee emp);


}
