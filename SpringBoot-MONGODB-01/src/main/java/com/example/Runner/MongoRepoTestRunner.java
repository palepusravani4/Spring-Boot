package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Document.Employee;
import com.example.Service.IEmployeeMgmtService;
@Component
public class MongoRepoTestRunner implements CommandLineRunner {
    
	@Autowired
	private IEmployeeMgmtService empservice;
	
	@Override
	public void run(String... args) throws Exception {
		/*try {
			//Insert 5 record with diff values
			Employee emp1=new Employee("Siri","andhra",25000.0,"tcs");
			Employee emp2=new Employee("Jhon","mp",35000.0,"hcl");
			Employee emp3=new Employee("Nani","ts",45000.0,"accenture");
			Employee emp4=new Employee("Bhanu","up",55000.0,"tcs");
			Employee emp5=new Employee("Hari","andhra",65000.0,"tcs");
			String s1=empservice.saveEmployee(emp1);
			String s2=empservice.saveEmployee(emp2);
			String s3=empservice.saveEmployee(emp3);
			String s4=empservice.saveEmployee(emp4);
			String s5=empservice.saveEmployee(emp5);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		/*try {
	     Iterable<Employee> e=empservice.showAllEmployees();
	     e.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			String id=empservice.showEmployeeById("69411a8f9a360b9b0b817145");
			System.out.println(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
       /*  try {
        	 String msg=empservice.updateEmployeeSalary("pass the id",10.0);
             System.out.println(msg);
         }catch(Exception e) {
        	 e.printStackTrace();
         }*/
		
		/*try {
			String byid=empservice.deleteEmployeeByIds(List.of("654444","7654333"));
		    System.out.println(byid);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}

}
