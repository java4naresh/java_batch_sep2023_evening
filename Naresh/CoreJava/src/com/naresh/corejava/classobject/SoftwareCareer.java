package com.naresh.corejava.classobject;

public abstract class SoftwareCareer {
	
	String jobType;
	
	public void basics() {
		if(jobType == "Technical") {
			System.out.println("Communication is important");
			System.out.println("We should be proficient in 'C' programming");
		} else {
			System.out.println("Communication is important");
		}
	}
	
	public abstract void technicalJob();
	

}