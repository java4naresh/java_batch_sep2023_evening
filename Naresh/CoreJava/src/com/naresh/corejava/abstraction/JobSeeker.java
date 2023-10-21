package com.naresh.corejava.abstraction;

public class JobSeeker {
	
	public static void main(String[] args) {
		SoftwareCareer java = new JavaDeveloper("Technical");
		java.basics();
		java.technicalSkills();
		
		SoftwareCareer python = new PythonDeveloper("Technical");
		python.basics();
		python.technicalSkills();
	}

}
