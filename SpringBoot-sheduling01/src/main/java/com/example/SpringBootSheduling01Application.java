package com.example;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootSheduling01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSheduling01Application.class, args);
		System.out.println("app started with "+new Date());
	}

}
