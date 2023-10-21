package com.naresh.corejava.abstraction;

public class PythonDeveloper extends SoftwareCareer {
	
	public PythonDeveloper(String jobType) {
		this.jobType = jobType;
	}

	@Override
	public void technicalSkills() {
		System.out.println("core python, adv python, mysql, Django");
		
	}

}
