package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMsEurekaserverCloudConfigServerMultipleMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsEurekaserverCloudConfigServerMultipleMsApplication.class, args);
	}

}
