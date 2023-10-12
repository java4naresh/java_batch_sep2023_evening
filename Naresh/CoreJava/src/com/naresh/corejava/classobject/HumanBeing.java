package com.naresh.corejava.classobject;

public class HumanBeing {
	
	String name;
	char gender;
	int age;
	
	static String living;
	static String drink;
	
	public HumanBeing(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public static void main(String[] args) {
		HumanBeing.living = "Earth";
		HumanBeing.drink = "Water";
		HumanBeing naresh = new HumanBeing("Naresh", 'M', 30);
		System.out.println(naresh.name);//Naresh
		System.out.println(naresh.age);//30
		System.out.println(naresh.gender);//M
		System.out.println(HumanBeing.living);//Earth
		System.out.println(HumanBeing.drink);//Water

	}
}
