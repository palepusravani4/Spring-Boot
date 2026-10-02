package com.example.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Doctor;
import com.example.Repository.IDoctorRepo;
@Service
public class DoctorMgmtServiceImpl implements IDoctorService {
    @Autowired  
	private IDoctorRepo repo;

	@Override
	public List<Doctor> searchDoctorsBySpecifications(String s1, String s2) {
		return repo.searchDoctorsBySpecifications(s1, s2);
	}

	@Override
	public List<Object[]> searchByDoctorDataByIncome(double start, double end) {
	
		return repo.searchByDoctorDataByIncome(start, end);
	}

	@Override
	public Optional<Doctor> showDoctorInfoByName(String name) {
		
		return repo.showDoctorInfoByName(name);
	}

	@Override
	public String showSpecificationByName(String name) {
	
	return repo.showSpecificationByName(name);
	}
}