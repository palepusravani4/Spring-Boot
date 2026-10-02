package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sbeans.Employee;
import com.example.sbeans.EmployeeOperationsController;



@SpringBootApplication
public class SpringBootMiniprojectUsingprofilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootMiniprojectUsingprofilesApplication.class, args);
		 EmployeeOperationsController emp=ctx.getBean(EmployeeOperationsController.class);
		   
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter empno");
		    int eno=sc.nextInt();
		    System.out.println("enter name");
		    String name=sc.next();
		    System.out.println("enter job");
		    String job=sc.next();
		    System.out.println("enter salary");
		    double sal=sc.nextDouble();
		    System.out.println("enter deptno");
		    int deptno=sc.nextInt();
		    Employee e=new Employee();
		    e.setEno(eno);
		    e.setEname(name);
		    e.setJob(job);
		    e.setSalary(sal);
		    e.setDeptno(deptno);
		    try {
		    	String msg=emp.processEmployee(e);
		    	System.out.println(msg);
		    }
		    catch(Exception ex) {
		    	ex.printStackTrace();
		    }
		    
		    try {
		    	List<Employee> list=emp.showAllEmployeesByDesgs("CLERK","MANAGER","it");
		    	list.forEach(e1->{
		    		System.out.println((e1));
		    	});
		    }catch(Exception ex) {
		    	ex.printStackTrace();
		    }
		    
		    ctx.close();
		    
		}
	}


