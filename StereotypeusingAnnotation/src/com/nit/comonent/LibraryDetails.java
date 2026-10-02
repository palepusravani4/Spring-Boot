package com.nit.comonent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("lib")
public class LibraryDetails {
	@Value("${library.name}")
	private String name;
	@Value("${library.location}")
	private String location;
	@Value("${library.maxBooks}")
	private int maxbooks;
	@Value("${library.openingHours}")
	private String openinghours;
	@Value("${library.closedOn}")
	private String closedon;
	@Value("${library.contactEmail}")
	private String email;
	@Override
	public String toString() {
		return "LibraryDetails [name=" + name + ", location=" + location + ", maxbooks=" + maxbooks + ", openinghours="
				+ openinghours + ", closedon=" + closedon + ", email=" + email + "]";
	}
	
	

}
