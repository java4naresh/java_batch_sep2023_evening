package com.naresh.corejava.abstraction;

public class PetLover {

	public static void main(String[] args) {
		Animal dog = new Dog("robin", "German Shephard", "Brown");
		dog.run();
		dog.makeSound();
		
		Animal cat = new Cat("Lucky", "White");
		cat.run();
		cat.makeSound();
	}

}
