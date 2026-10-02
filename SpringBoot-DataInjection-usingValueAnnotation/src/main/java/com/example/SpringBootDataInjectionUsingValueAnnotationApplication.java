package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sbeans.Company;

@SpringBootApplication
public class SpringBootDataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootDataInjectionUsingValueAnnotationApplication.class, args);
	     Company c=ctx.getBean(Company.class);
	     System.out.println(c);
	}

}
