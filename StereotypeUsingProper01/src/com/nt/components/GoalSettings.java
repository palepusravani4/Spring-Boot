package com.nt.components;

import org.springframework.beans.factory.annotation.Autowired;

public class GoalSettings {
	@Autowired
	private GoalStrategy str;
	
	public String settings(GoalData data) {
		return str.evaluateGoalProgress(data);
		
	}

}
