package com.example.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Entity.Doctor;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer>{
	
	@Query("from Doctor where specification in(:s1,:s2) order by specification")
 public List<Doctor> searchDoctorsBySpecifications(String s1,String s2);
	@Query("from Doctor where income>?1 and income<=?2")
	public List<Object[]> searchByDoctorDataByIncome(double start,double end);
	@Query("from Doctor where name=?1")
	public Optional<Doctor> showDoctorInfoByName(String name);
	@Query("select specification from Doctor where name=:name")
	public String showSpecificationByName(String name);
}
