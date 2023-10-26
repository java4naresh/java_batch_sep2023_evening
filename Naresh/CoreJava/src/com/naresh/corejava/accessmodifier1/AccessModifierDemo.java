package com.naresh.corejava.accessmodifier1;

public class AccessModifierDemo {
	
	public static String name1;
	protected static String name2;
	static String name3;
	private static String name4;
	
	static {
		name1 = "Chiru";
		name2 = "Pawan Kalyan";
		name3 = "Charan";
		name4 = "Bunny";
	}
	
	public AccessModifierDemo() {
		
	}
	
	protected AccessModifierDemo(int num) {
		
	}
	
    AccessModifierDemo(int num1, int num2) {
		
	}
    
    private AccessModifierDemo(int num1, int num2, int num3) {
		
   	}
		
	public static void printName(String name) {
		System.out.println("Your name is "+name);
	}
	
	protected static void printName2(String name) {
		System.out.println("Your name is "+name);
	}
	
	static void printName3(String name) {
		System.out.println("Your name is "+name);
	}
	
	private static void printName4(String name) {
		System.out.println("Your name is "+name);
	}
	
	public static void main(String[] args) {
		AccessModifierDemo.printName4("Srinivas");
		System.out.println(AccessModifierDemo.name4);
		AccessModifierDemo demo = new AccessModifierDemo();
		AccessModifierDemo demo2 = new AccessModifierDemo(10);
		AccessModifierDemo demo3 = new AccessModifierDemo(10, 20);
		AccessModifierDemo demo4 = new AccessModifierDemo(10, 20, 30);
	}

}
