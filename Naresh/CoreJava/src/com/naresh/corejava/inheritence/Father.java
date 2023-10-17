package com.naresh.corejava.inheritence;

public class Father {
	
	String surName;
	int property;
	
	public Father() {
		System.out.println("Father class constructor");
	}
	
	public Father(String surName, int property) {
		
	}
	
	public void familySurName() {
		System.out.println(surName);
	}
	
	public void healthIssues() {
		System.out.println("No health issues");
	}
	
	public void livingPlace() {
		System.out.println("Independent House");
	}

}
