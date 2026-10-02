package com.example.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix="org.nit")
public class Employee {
	
	private Integer eno;
	private String ename;
	private String []favcolors;
	private List<String> nicknames;
	private Set<Long>phoneno;
	private Map<String,Object>iddetails;
	private Company company;

}
