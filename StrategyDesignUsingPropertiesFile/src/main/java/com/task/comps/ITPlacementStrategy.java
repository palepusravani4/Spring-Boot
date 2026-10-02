package com.task.comps;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("it")
public class ITPlacementStrategy implements PlacementStrategy {
	
	@Value("${it.minCgpa}")
	Double minCgpa;
	
	@Value("${it.baseSalary}")
	Double baseSalary;
	
	@Value("#{'${it.requiredSkills}'.split(',')}")
	String requiredSkills[];
	

	@Override
	public String recommendedPlacement(Student student) {
		 
		 String eligible = student.getCgpa() >= this.minCgpa ? "YES" : "NO";
		 
		 return "Selected Strategy: ITPlacement\n" + 
		         "Eligible: " + eligible + "\n" +
		         "Recommended Salary: " + baseSalary + "\n" + 
		         "Required Skills: " + Arrays.toString(requiredSkills);
		
		
	}

}
