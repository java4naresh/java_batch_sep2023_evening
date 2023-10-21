package com.naresh.corejava.abstraction;

public class JavaDeveloper extends SoftwareCareer {
	
	public JavaDeveloper(String jobType) {
		this.jobType = jobType;
	}

	@Override
	public void technicalSkills() {
		System.out.println("Core java, adv java, my sql, Spring framework");
		
	}

}
