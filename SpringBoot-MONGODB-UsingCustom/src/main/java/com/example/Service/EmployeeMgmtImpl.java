package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Document.Employee;
import com.example.Repository.IEmployeeRepository;
@Service
public class EmployeeMgmtImpl implements IEmployeeMgmt {
    @Autowired
	private IEmployeeRepository repo;
	  
	@Override
	public List<Employee> showEmployeesByAddrs(List<String> cities) {
	
		return repo.findByEaddrIn(cities);
	}

	@Override
	public List<Employee> showEmployeesBySalaryRange(double start, double end) {
		
		return repo.findBySalaryBetween(start, end);
	}

	@Override
	public List<Object[]> fetchEmployeesDataByAddrs(String addr) {
		
		return repo.showEmployeeDataBYAddr(addr);
	}

	@Override
	public List<Employee> fetchEmployeesBySalaryRange(double start, double end) {

		return repo.showEmployeeBySalRange(start, end);
	}

	@Override
	public List<Employee> fetchEmployeesByAddrs(String addrs1, String addrs2) {
	
		return repo.showEmpAddrOrCondition(addrs1, addrs2);
	}

}
