package com.task.comps;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mgmt")
public class ManagementStrategy implements PlacementStrategy {

	@Value("${mgmt.minCgpa}")
	Double minCgpa;
	@Value("${mgmt.salary}")
	Double baseSalary;
	@Value("#{'${mgmt.requiredSkills}'.split(',')}")
	String requiredSkills[];
	

	@Override
	public String recommendedPlacement(Student student) {
		 
		 String eligible = student.getCgpa() >= this.minCgpa ? "YES" : "NO";
		 
		 return "Selected Strategy: ManagementPlacement\n" + 
		         "Eligible: " + eligible + "\n" +
		         "Recommended Salary: " + baseSalary + "\n" + 
		         "Required Skills: " + Arrays.toString(requiredSkills);
		
		
	}

}
