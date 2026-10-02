package com.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.task.comps.PlacementStrategy;
import com.task.comps.Student;

@Component("placement")
public class PlacementService {
	
	@Autowired
	@Qualifier("selection")
	private PlacementStrategy placementStrategy;
	
	public String getPlacementRecommendation(Student student) {
		return placementStrategy.recommendedPlacement(student);
	}

}
