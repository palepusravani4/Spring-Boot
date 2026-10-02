package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Department;

public class DependencyinjectionTest2 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext1.xml");
		Department d=(Department) ctx.getBean("d1");
          d.showDepartmentData();
	}

}
