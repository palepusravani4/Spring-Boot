package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.sbeans.Employee;
import com.example.demo.sbeans.EmployeeOperationsController;

@SpringBootApplication
public class SpringBootProject04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootProject04Application.class, args);
	    EmployeeOperationsController emp=ctx.getBean(EmployeeOperationsController.class);
	   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter name");
	    String name=sc.next();
	    System.out.println("enter job");
	    String job=sc.next();
	    System.out.println("enter salary");
	    double sal=sc.nextDouble();
	    System.out.println("enter deptno");
	    int deptno=sc.nextInt();
	    Employee e=new Employee();
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
	    	List<Employee> list=emp.showAllEmployeesByDesgs("CLERK","MANAGER","SALESMAN");
	    	list.forEach(e1->{
	    		System.out.println((e1));
	    	});
	    }catch(Exception ex) {
	    	ex.printStackTrace();
	    }
	    
	    ctx.close();
	    
	}}