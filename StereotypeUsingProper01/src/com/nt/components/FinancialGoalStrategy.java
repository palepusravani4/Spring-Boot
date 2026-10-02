package com.nt.components;

import org.springframework.beans.factory.annotation.Value;

public class FinancialGoalStrategy implements GoalStrategy{

	@Value("financial.targetAmount")
	double amount;
	@Value("financial.monthlyRate")
	int monthrate;
	@Value("financial.deadlineMonths")
	int deadlinemon;
	
	
	@Override
	public String evaluateGoalProgress(GoalData data) {
	double progress=(data.getWorkdone()/amount)*100;
		return "Selected Strategy: FITNESS GOAL\n" +
		        "Progress: " + String.format("%.2f", progress) + "%\n" +
		        "Stay consistent with your savings!";
	}

}
