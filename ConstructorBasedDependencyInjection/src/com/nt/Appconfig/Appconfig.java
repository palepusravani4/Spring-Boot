package com.nt.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Address;
import com.nt.sbeans.Principal;
import com.nt.sbeans.School;

@Configuration
public class Appconfig {
	@Bean
	public Principal principal() {
		Principal p=new Principal();
		p.setName("Dr. Anil Kumar");
		p.setExp(20);
		return p;
	}
	@Bean
    public Address address() {
    	Address a=new Address();
    	a.setCity("Hyderabad");
    	a.setState("Telangana");
    	return a;
    }
	@Bean
    public School school() {
    	School s=new School();
    	s.setSchoolName("Sunshine High School");
    	s.setPrincipal(principal());
    	s.setAddress(address());
    	return s;
    }
}
