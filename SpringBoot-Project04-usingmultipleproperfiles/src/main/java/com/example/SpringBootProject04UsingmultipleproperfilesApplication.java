package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sbeans.Hotel;

@SpringBootApplication
public class SpringBootProject04UsingmultipleproperfilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootProject04UsingmultipleproperfilesApplication.class, args);
	    Hotel h=ctx.getBean("hotel",Hotel.class);
	    System.out.println(h);
	
	}

}
