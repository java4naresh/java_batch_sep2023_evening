package com.naresh.corejava.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		treeSetExamples();

	}
	
	public static void treeSetExamples() {
		/*Set<String> names = new TreeSet<>();
		names.add("Rohit");
		names.add("Kohli");
		names.add("Gill");
		names.add("Shreyas");
		names.add("Rahul");
		names.add("Surya");
		names.add("Jadeja");
		names.add("Shami");
		names.add("Kuldeep");
		names.add("Bumra");
		names.add("Siraj");
		names.add("Rohit");
		System.out.println(names);*/
		
		/*Set<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(50);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		System.out.println(numbers);*/
		
		Set<Character> chars = new TreeSet<>();
		chars.add('a');
		chars.add('A');
		chars.add('B');
		chars.add('b');
		chars.add('y');
		chars.add('Y');
		System.out.println(chars);
	}
	
	public static void linkedhashSetExamples() {
		Set<String> names = new LinkedHashSet<>();
		names.add("Rohit");
		names.add("Kohli");
		names.add("Gill");
		names.add("Shreyas");
		names.add("Rahul");
		names.add("Surya");
		names.add("Jadeja");
		names.add("Shami");
		names.add("Kuldeep");
		names.add("Bumra");
		names.add("Siraj");
		names.add("Rohit");
		System.out.println(names);
		//System.out.println("Rohit".hashCode());
		//names.remove("Rohit");
	    System.out.println(names.getClass());
		System.out.println(names);
	}
	
	public static void hashSetExamples() {
		Set<String> names = new HashSet<>();
		names.add("Rohit");
		names.add("Kohli");
		names.add("Gill");
		names.add("Shreyas");
		names.add("Rahul");
		names.add("Surya");
		names.add("Jadeja");
		names.add("Shami");
		names.add("Kuldeep");
		names.add("Bumra");
		names.add("Siraj");
		names.add("Rohit");
		System.out.println(names);
		//System.out.println("Rohit".hashCode());
		//names.remove("Rohit");
		System.out.println(names);
	}

}
