package com.naresh.corejava.accessmodifier1;

public class AccessModifierClient {

	public static void main(String[] args) {
		AccessModifierDemo.printName("Naresh");
		AccessModifierDemo.printName2("Pavan");
		AccessModifierDemo.printName3("Akhil");
		//printName4 method is private we cannot access from out side class
		//AccessModifierDemo.printName4("Srinivas");
		System.out.println(AccessModifierDemo.name1);
		System.out.println(AccessModifierDemo.name2);
		System.out.println(AccessModifierDemo.name3);
		//System.out.println(AccessModifierDemo.name4);
		AccessModifierDemo demo = new AccessModifierDemo();
		AccessModifierDemo demo2 = new AccessModifierDemo(10);
		AccessModifierDemo demo3 = new AccessModifierDemo(10, 20);
		//AccessModifierDemo demo4 = new AccessModifierDemo(10, 20, 30);
	}

}
