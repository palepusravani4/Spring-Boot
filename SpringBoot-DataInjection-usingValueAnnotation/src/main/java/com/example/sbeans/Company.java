package com.example.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
//@ConfigurationProperties(prefix="org")
public class Company {
	//@Value("${org.name}")
	private String name;
	//@Value("${org.loc}")
	private String location;
	//@Value("${org.pin}")
	private Integer pincode;
	//@Value("${org.phoneno}")
	private String phoneno;

}
