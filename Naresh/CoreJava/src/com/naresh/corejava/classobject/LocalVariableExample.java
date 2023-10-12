package com.naresh.corejava.classobject;

public class LocalVariableExample {
	
	//instance variables or global variables or object variables
	String name = "Pavan";
	
	public void method1(String name) {
		//String name = "naresh";
		System.out.println(name);//naresh
	}
	
	public void method2() {
		System.out.println(name);//Pavan
	}
	

	public static void main(String[] args) {
		

	}

}
