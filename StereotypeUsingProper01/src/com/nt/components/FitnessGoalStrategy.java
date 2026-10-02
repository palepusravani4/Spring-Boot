package com.nt.components;

import org.springframework.beans.factory.annotation.Value;

public class FitnessGoalStrategy implements GoalStrategy{

	@Value("${fitness.targetWeightLoss}")
	int targetwtloss;
	@Value("${fitness.weeks}")
	int weeks;
	@Value("$(fitness.intensityLevel}")
	String level;
	
	
	@Override
	public String evaluateGoalProgress(GoalData data) {
		double progress=(data.getWorkdone()/targetwtloss)*100;
		return "Selected Strategy: FITNESS GOAL\n" +
		        "Progress: " + String.format("%.2f", progress) + "%\n" +
		        "Stay consistent with your savings!";
	}

}
