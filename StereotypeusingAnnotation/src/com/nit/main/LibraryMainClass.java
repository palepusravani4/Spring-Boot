package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.comonent.LibraryDetails;
import com.nit.configuration.Appconfig2;

public class LibraryMainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig2.class);
            LibraryDetails li=ctx.getBean("lib",LibraryDetails.class);
	      System.out.println(li);
	
	}

}
