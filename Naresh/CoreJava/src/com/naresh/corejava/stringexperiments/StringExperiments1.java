package com.naresh.corejava.stringexperiments;

public class StringExperiments1 {

	public static void main(String[] args) {
		String name = "Naresh";//string literal
		String name2 = new String("Naresh");//new key word
		String name3 = "Naresh";
		String name4 = "Naresh";
		String name5 = "Naresh";
		String name6 = new String("Naresh");
		//System.out.println(name);
		//System.out.println(name2);
		//System.out.println(name3);
		
		if(name == name2) System.out.println("same1");
		
		if(name == name3) System.out.println("same2");
		
		if(name == name4) System.out.println("same3");
		
		if(name == name5) System.out.println("same4");
		
		if(name2 == name6) System.out.println("same5");
		
		if(name.equals(name2)) System.out.println("equals");

	}

}
