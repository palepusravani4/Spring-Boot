package com.example.Service;

import java.util.List;
import java.util.Optional;



import com.example.Entity.Doctor;

public interface IDoctorService {

	
	 public List<Doctor> searchDoctorsBySpecifications(String s1,String s2);
		
		public List<Object[]> searchByDoctorDataByIncome(double start,double end);
		
		public Optional<Doctor> showDoctorInfoByName(String name);
		
		public String showSpecificationByName(String name);
	}