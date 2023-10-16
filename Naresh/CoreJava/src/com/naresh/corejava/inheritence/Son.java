package com.naresh.corejava.inheritence;

public class Son extends Father {
	
	/*String surName;
	int property;*/
	String extraSkills;
	String education;
	
	public Son(String surName, int property, String extraSkills, String education) {
		this.surName = surName;
		this.property = property;
		this.extraSkills = extraSkills;
		this.education = education;
	}
	
	/*public void healthIssues() {
		System.out.println("No health issues");
	}
	
	public void livingPlace() {
		System.out.println("Independent House");
	}*/
	
	public void designation() {
		if(education == "Technical") {
			System.out.println("Software Industry");
		} else {
			System.out.println("Not Software Industry");
		}
	}
	
	public static void main(String[] args) {
		Son naresh = new Son("Naresh", 5, "Teach", "Technical");
		naresh.healthIssues();
	}

}
