package com.naresh.corejava.inheritence;

public class IndpendentHouse {
	
	String address;
	int sft;
	int totalNumberOfBedrooms;
	int hallWidth;
	
	public void sleep() {
		System.out.println("We have a nice"+ totalNumberOfBedrooms+ " in the house to sleep");
	}
	
	public void eating() {
		System.out.println("We have a very nice "+ sft+ " spacius  dining room");
	}
	
	public void spendTimeWithFamily() {
		System.out.println("We have a "+ hallWidth +" sfts hall with TV to spend and enjoy with family");
	}

}
