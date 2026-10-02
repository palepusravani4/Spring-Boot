package com.example.demo.sbeans;

import java.util.List;

public interface IEmployeeDAO {
	public List<Employee> getEmployeeByDesgs(String d1,String d2,String d3)throws Exception;
    public int inserEmployee(Employee emp)throws Exception;
}
