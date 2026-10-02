package com.nit.comonent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spring")
public class SpringDetails {
	@Value("${app.name}")
	private String name;
	@Value("${app.version}")
	private String version;
	@Value("${app.description}")
	private String desc;
	@Value("${app.author}")
	private String author;
	@Value("${app.contactEmail}")
	private String email;
	@Value("${app.maxUsers}")
	private int maxusers;
	@Override
	public String toString() {
		return "SpringDetails [name=" + name + ", version=" + version + ", desc=" + desc + ", author=" + author
				+ ", email=" + email + ", maxusers=" + maxusers + "]";
	}
	
	

}
