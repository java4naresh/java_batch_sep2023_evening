package com.naresh.corejava.accessmodifier2;

import com.naresh.corejava.accessmodifier1.AccessModifierDemo;

public class AccessModifierSubClass extends AccessModifierDemo {
	
	public AccessModifierSubClass() {
		super(10);
	}

	public static void main(String[] args) {
		AccessModifierDemo.printName2("Pavan");
		//printName3 method is default access modifier we cannot access from another package
		//AccessModifierDemo.printName3("Akhil");
		//printName4 method is private we cannot access from out side class
		//AccessModifierDemo.printName4("Srinivas");
		System.out.println(AccessModifierDemo.name1);
		System.out.println(AccessModifierDemo.name2);
		//System.out.println(AccessModifierDemo.name3);
		//System.out.println(AccessModifierDemo.name4);
		//AccessModifierDemo demo = new AccessModifierDemo();
	}
}
