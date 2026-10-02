package com.nt.sbeans;

public class Project {
	int projectId;
	String proName;
	int duration;
	public Project(int projectId, String proName, int duration) {
		super();
		this.projectId = projectId;
		this.proName = proName;
		this.duration = duration;
	}
	public void getProjectInfo() {
		System.out.println("project id"+projectId);
		System.out.println("project Name"+proName);
		System.out.println("project duration"+duration);
	}

}
