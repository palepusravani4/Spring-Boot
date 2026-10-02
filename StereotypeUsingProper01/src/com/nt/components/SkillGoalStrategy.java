package com.nt.components;

import org.springframework.beans.factory.annotation.Value;

public class SkillGoalStrategy implements GoalStrategy{
	
	@Value("${skill.targetHours}")
	int targethours;
	@Value("${skill.weeklyHoursPlanned}")
	int weeklyhrs;
     @Value("${skill.skillName}")
     String skill;
	@Override
	public String evaluateGoalProgress(GoalData data) {
		double progress=(data.getWorkdone()/targethours)*100;
		return  "Selected Strategy: FITNESS GOAL\n" +
		        "Progress: " + String.format("%.2f", progress) + "%\n" +
		        "Stay consistent with your savings!";
	}

}
