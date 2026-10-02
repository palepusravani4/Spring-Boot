package com.example.demo.sbeans;

import java.util.List;

public interface IEmployeeService {
	public List<Employee> fetchAllEmployeesByDesgs(String d1,String d2,String d3) throws Exception;
    public String registerEmployee(Employee emp)throws Exception;
}
