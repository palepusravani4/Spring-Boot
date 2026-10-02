package com.example.Runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Service.IEmployeeMgmt;
@Component
public class EmployeeRunner implements CommandLineRunner {
    @Autowired
	private IEmployeeMgmt impl;
	 
	@Override
	public void run(String... args) throws Exception {
//		try {
//           List<Employee> showEmployeesByAddrs = impl.showEmployeesByAddrs(List.of("up","mp"));
//           System.out.println(showEmployeesByAddrs);
//           showEmployeesByAddrs.forEach(System.out::println);
//	     }
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		/*try {
			List<Employee> showEmployeesBySalaryRange = impl.showEmployeesBySalaryRange(25000, 60000);
			showEmployeesBySalaryRange.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			List<Object[]> fetchEmployeesDataByAddrs = impl.fetchEmployeesDataByAddrs("andhra");
			fetchEmployeesDataByAddrs.forEach(e->{System.out.println(Arrays.toString(e));});
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
