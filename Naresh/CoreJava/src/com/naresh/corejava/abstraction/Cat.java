package com.naresh.corejava.abstraction;

public class Cat extends Animal {

	String catName;
	String color;
	
	public Cat(String catName, String color) {
		this.catName = catName;
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println("My name is "+catName);
		System.out.println("mew mew");
		
	}

}
