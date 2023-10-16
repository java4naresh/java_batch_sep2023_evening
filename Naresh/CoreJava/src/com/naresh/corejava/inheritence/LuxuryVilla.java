package com.naresh.corejava.inheritence;

public class LuxuryVilla extends IndpendentHouse {
	
	/*String address;
	int sft;
	int totalNumberOfBedrooms;
	int hallWidth;*/
	int swimmingPoolWidth;
	int gymWidth;
	int walkingArea;
	
	/*public void sleep() {
		System.out.println("We have a nice"+ totalNumberOfBedrooms+ " in the house to sleep");
	}
	
	public void eating() {
		System.out.println("We have a very nice "+ sft+ " spacius  dining room");
	}
	
	public void spendTimeWithFamily() {
		System.out.println("We have a "+ hallWidth +" sfts hall with TV to spend and enjoy with family");
	}*/
	
	public void swim() {
		System.out.println("We have a "+ swimmingPoolWidth +" sfts swimming pool to swim");
	}
	
	public void excerisize() {
		System.out.println("We have a "+ gymWidth +" sfts Gym to do excerisize");
	}
	
	public void relax() {
		System.out.println("We have a "+ walkingArea +" sfts Walking area with trees to relax");
	}
	
	public static void main(String[] args) {
		IndpendentHouse ih = new IndpendentHouse();
		ih.sleep();
		ih.eating();
		ih.spendTimeWithFamily();
		
		LuxuryVilla luxuryVilla = new LuxuryVilla();
		luxuryVilla.sleep();
	}

}
