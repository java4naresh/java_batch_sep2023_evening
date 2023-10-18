package com.naresh.corejava.hasarelation;

public class Car {
	
	String model;
	String brand;
	String color;
	
	public Car(String model, String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
	
	public void longDrive(String destination) {
		System.out.println("welcome to "+ brand+ " "+ model + " the india's safest car");
		System.out.println("Enjoy music system");
		System.out.println("reached "+ destination);
	}

}
