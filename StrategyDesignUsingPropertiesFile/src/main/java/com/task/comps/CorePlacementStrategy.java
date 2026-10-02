package com.task.comps;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("core")
public class CorePlacementStrategy implements PlacementStrategy {

	@Value("${core.minCgpa}")
	Double minCgpa;
	@Value("${core.salary}")
	Double baseSalary;
	@Value("#{'${core.requiredSkills}'.split(',')}")
	String requiredSkills[];
	

	@Override
	public String recommendedPlacement(Student student) {
		 String eligible = student.getCgpa() >= this.minCgpa ? "YES"  : "NO";
		 
		 return "Selected Strategy: CorePlacement\n" + 
		         "Eligible: " + eligible + "\n" +
		         "Recommended Salary: " + baseSalary + "\n" + 
		         "Required Skills: " + Arrays.toString(requiredSkills);
		
		
	}

}
