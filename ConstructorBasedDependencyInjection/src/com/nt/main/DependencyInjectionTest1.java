package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.University;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		try(FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");){
		University u=(University) ctx.getBean("u1");
		u.displayUniversityData();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
