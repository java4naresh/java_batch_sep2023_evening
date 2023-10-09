package com.srilatha.corejava.classobject;

public class Person {
	String name;
	int age;
	char gender;
	String color;
	double height;
	double weight;

	public static void main(String args[]) {
		Person srilatha=new Person();
		System.out.println(srilatha);
		srilatha.name="Srilatha";
		srilatha.age=23;
		srilatha.gender='F';
		srilatha.color="fair";
		srilatha.height=5.4;
		srilatha.weight=55;
		System.out.println(srilatha);
		
		Person syamala=new Person();
		System.out.println(syamala);
		syamala.name="Syamala";
		syamala.age=22;
		syamala.gender='F';
		syamala.color="fair";
		syamala.height=5.4;
		syamala.weight=55;
		System.out.println(syamala);
	}
	
	
	public String toString() {
		return "Person[name="+name+", age="+age+", gender="+gender+", color="+color+", height="+height+", weight="+weight+"]";
	}
}
