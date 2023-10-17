package com.naresh.corejava.inheritence;

public class Daughter extends Mother {
	
	public Daughter() {//we need to handle super class constructor from here
		System.out.println("Daughter constructer");
	}
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
	}

}
