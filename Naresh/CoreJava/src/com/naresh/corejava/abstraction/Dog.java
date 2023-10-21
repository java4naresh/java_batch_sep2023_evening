package com.naresh.corejava.abstraction;

public class Dog extends Animal {
	
	String dogName;
	String bread;
	String color;
	
	

	public Dog(String dogName, String bread, String color) {
		super();
		this.dogName = dogName;
		this.bread = bread;
		this.color = color;
	}

	@Override
	public void makeSound() {
		System.out.println("My name is "+dogName);
		System.out.println("I will make sound bow bow");
		
	}
	
	

}
