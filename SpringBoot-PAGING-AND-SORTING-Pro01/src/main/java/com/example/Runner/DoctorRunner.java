package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.example.Entity.Doctor;
import com.example.Service.IDoctor;
@Component
public class DoctorRunner implements CommandLineRunner{
      @Autowired
	  private  IDoctor doc;
	@Override
	public void run(String... args) throws Exception {
//		doc.showDoctorsBySorting(true,"income").forEach(System.out::println);
//		System.out.println("-----------------");
//	   doc.showDoctorsBySorting(false,"income","name").forEach(System.out::println);

		Page<Doctor> p=doc.showDoctorsInfoByPageNos(0, 7, true, "income");
		System.out.println("pageno :"+p.getNumber());
		System.out.println("pages count :"+p.getTotalPages());
		System.out.println("is it first :"+p.isFirst());
		System.out.println("is it last :"+p.isLast());
		System.out.println("page size :"+p.getSize());
		if(!p.isEmpty()) {
			List<Doctor> list=p.getContent();
			list.forEach(System.out::println);
		}else {
			System.out.println("page is not found");
		}
		
	
	}

}
