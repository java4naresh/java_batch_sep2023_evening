package com.naresh.corejava.hasarelation;

public class Person {
	
	String name;
	Car car;
	
	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public void longDrive(String destination) {
		car.start();
		car.longDrive(destination);
		
	}

}
