package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sbeans.Employee;

@SpringBootApplication
public class SpringBootDataInjectionUsingValueAnnotation2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDataInjectionUsingValueAnnotation2Application.class, args);
	     Employee e=run.getBean(Employee.class);
	     System.out.println(e);
	     
	
	
	
	}

}
