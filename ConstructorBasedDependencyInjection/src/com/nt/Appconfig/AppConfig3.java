package com.nt.Appconfig;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.day1.sbeans.Bank;

@Configuration
public class AppConfig3 {
	@Bean("b")
	public Bank bank() {
		Bank b=new Bank();
		b.setBankname("Axis Bank");
		b.setBranches(Map.of("Boo1","Hyderabad","Book2","Chennai", "Book3","Pune"));
		return b;
		
		
	}
	

}
