package com.example;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Entity.Doctor;
import com.example.Service.DoctorMgmtServiceImpl;

@SpringBootApplication
public class SpringBootDatajpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDatajpaProject01Application.class, args);
		DoctorMgmtServiceImpl doc=run.getBean("impl",DoctorMgmtServiceImpl.class);
		
		Doctor d1=new Doctor();
		d1.setName("Roja"); d1.setSpecification("orthopedic");d1.setIncome(new BigDecimal("20000.00"));
		String register1= doc.registerDoctor(d1);
		System.out.println(register1);
		Doctor d2=new Doctor();
		d2.setName("Roja"); d2.setSpecification("Gynochologist"); d2.setIncome(new BigDecimal("30000.00"));
		String register2= doc.registerDoctor(d2);
		System.out.println(register2);
		
//		long count=doc.showDoccount();
//		System.out.println("total doctors count :"+count);
//		
//		List<Doctor> list=List.of(d1,d2);
//		String msg=doc.registerDetails(list);
//		System.out.println(msg);
//		
//		d1=doc.showDoctorById(102);
//		System.out.println(d1);
//	
	
	
	
	}

}
