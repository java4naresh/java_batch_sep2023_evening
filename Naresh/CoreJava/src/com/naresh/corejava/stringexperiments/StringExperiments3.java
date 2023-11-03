package com.naresh.corejava.stringexperiments;

public class StringExperiments3 {

	public static void main(String[] args) {
		String fullName = "Naresh Kambala";
		String cricketers = "Rohit,Kohli,Gill,Rahul,Shreyas,Surya";
		System.out.println(fullName.substring(7));
		System.out.println(fullName.substring(0, 6));
		System.out.println(cricketers.substring(6, 11));
		System.out.println(cricketers.substring(12));
		String[] cricketerNames = cricketers.split(",");
		System.out.println(cricketerNames[0]);
		System.out.println(cricketerNames[1]);
		
		//regular expressions
		String firstName = "Naresh";
		String word = "ab";
		System.out.println(word.matches("[abc]"));//false
		String numb = "111112222";
		System.out.println(numb.matches("[123]+"));//
		System.out.println(word.matches("[abc]+"));
		
		
		//System.out.println(firstName.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcefghijklmnopqrstuvwxyz]+"));
		System.out.println(firstName.matches("[A-Za-z]+"));
		
		String phoneNumber = "9951288766";
		System.out.println(phoneNumber.matches("[0-9]{10}"));
		String email = "java4naresh@gmail.com";
		System.out.println(email.matches("[a-z0-9A-Z]+[@][a-z]+[.][a-z]+"));

	}

}
