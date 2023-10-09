package com.naresh.corejava.classobject;


public class Person {
	String name;
	int age;
	char gender;
	String color;
	double weight;
	double height;
	
    public Person() {//zero param constructor
		System.out.println("constructor");
	}
    
    public Person(String name, int age, char gender, String color, 
    		double weight, double height) {//parameter constructor
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.color = color;
    	this.weight = weight;
    	this.height = height;
    }
	
	public void awakeTime(double awakeTime) {
		System.out.println(name+ " will wake up at "+awakeTime+" am");
	}
	
	public void excersizeTime(double excersizeTime) {
		if(age <= 30) {
			if(excersizeTime >= 1.0) {
				System.out.println(name+" Your Excersize spending time is correct");
			} else {
				System.out.println(name+" Your Excersize spending time should increase");
			}
		} else {
			if(excersizeTime >= 0.45) {
				System.out.println(name+" Your Excersize spending time is correct");
			} else {
				System.out.println(name+" Your Excersize spending time should increase");
			}
		}
	}
	
	public static void main(String[] args) {
		Person naresh = new Person("Naresh", 30, 'M', "white", 75, 5.8);
		System.out.println(naresh);
		naresh.name = "Naresh";
		naresh.age = 30;
		naresh.gender = 'M';
		naresh.color = "white";
		naresh.weight = 75;
		naresh.height = 5.8;
		//naresh.awakeTime(6.31);//method calling
		//naresh.excersizeTime(0.31);//method calling
		//System.out.println(naresh);
		Person srinivas = new Person();
		//System.out.println(srinivas);
		srinivas.name = "Srinivas";
		srinivas.age = 29;
		srinivas.gender = 'M';
		srinivas.color = "white";
		srinivas.weight = 75;
		srinivas.height = 5.8;
		//srinivas.awakeTime(6.35);//method calling
		//System.out.println(srinivas);
		Person pavan = new Person();
		//System.out.println(pavan);
		pavan.name = "Pavan";
		pavan.age = 50;
		pavan.color = "white";
		pavan.gender = 'M';
		pavan.height = 5.11;
		pavan.weight = 70.0;
		//pavan.awakeTime(6);//method calling
		//pavan.excersizeTime(0.46);//method calling
		//System.out.println(pavan);
	}
	
	public String toString() {
		return "Person[name="+name+", age="+age+", gender="+gender+", color="+color
				+", weight="+weight+", height="+height+"]";
	}
	
	

}
