package com.naresh.corejava.classobject;


public class Person {
	String name;
	int age;
	char gender;
	String color;
	double weight;
	double height;
	
	public static void main(String[] args) {
		Person naresh = new Person();
		System.out.println(naresh);
		naresh.name = "Naresh";
		naresh.age = 30;
		naresh.gender = 'M';
		naresh.color = "white";
		naresh.weight = 75;
		naresh.height = 5.8;
		System.out.println(naresh);
		Person srinivas = new Person();
		System.out.println(srinivas);
		srinivas.name = "Srinivas";
		srinivas.age = 29;
		srinivas.gender = 'M';
		srinivas.color = "white";
		srinivas.weight = 75;
		srinivas.height = 5.8;
		System.out.println(srinivas);
	}
	
	public String toString() {
		return "Person[name="+name+", age="+age+", gender="+gender+", color="+color
				+", weight="+weight+", height="+height+"]";
	}
	
	

}
