package com.example.Runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.Doctor;
import com.example.Service.IDoctorService;
@Component
public class DoctorRunner implements CommandLineRunner {
	
	@Autowired
	IDoctorService service;

	@Override
	public void run(String... args) throws Exception {
		try {
//			service.searchByDoctorDataByIncome(5000.0, 60000.0).forEach(row->{
//				System.out.println(Arrays.toString(row));
//			});
			//service.searchDoctorsBySpecifications("cordialogy", "orthopedic").forEach(System.out::println);
			
			Optional<Doctor> showDoctorInfoByName = service.showDoctorInfoByName("Roja");
			System.out.println(showDoctorInfoByName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
