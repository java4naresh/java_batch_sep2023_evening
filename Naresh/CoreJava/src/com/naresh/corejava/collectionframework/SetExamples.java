package com.naresh.corejava.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		customTreeSet();

	}
	
	public static void iteratorExampleForSet() {
		Set<String> names = new TreeSet<>();
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
		
		Iterator<String> namesIterator = names.iterator();
		while(namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
		}
		
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
	
	
	
	public static void  customTreeSet() {
		String word1 = "kohli";
		String word2 = "Rohit";
		System.out.println(word1.compareTo(word2));
		Set<String> names = new TreeSet<>();
		names.add("Rohit");
		System.out.println(names);
		names.add("kohli");
		System.out.println(names);
		
		Set<Customer> customers = new TreeSet<>();
		customers.add(new Customer(3, "Pavan"));
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(1, "Naresh Kambala"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(3, "Pavan"));
		//System.out.println(customers);
		
		Iterator<Customer> namesIterator = customers.iterator();
		while(namesIterator.hasNext()) {
			Customer customer = namesIterator.next();
			System.out.println(customer);
		}
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
	
	public static void customLinkedHashSet() {
		Set<Customer> customers = new LinkedHashSet<>();
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(3, "Pavan"));
		customers.add(new Customer(1, "Naresh Kambala"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(3, "Pavan"));
		System.out.println(customers);
	}
	
	public static void customHashSet() {
		Set<Customer> customers = new HashSet<>();
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(3, "Pavan"));
		customers.add(new Customer(1, "Naresh Kambala"));
		customers.add(new Customer(2, "Srilatha"));
		customers.add(new Customer(3, "Pavan"));
		System.out.println(customers);
	}
	
	public static void hashSetExamples() {
		Set<String> names = new HashSet<>();
		names.add(new String("Rohit"));
		names.add(new String("Kohli"));
		names.add(new String("Gill"));
		names.add(new String("Shreyas"));
		names.add(new String("Rahul"));
		names.add(new String("Surya"));
		names.add(new String("Jadeja"));
		names.add(new String("Shami"));
		names.add(new String("Kuldeep"));
		names.add(new String("Bumra"));
		names.add(new String("Siraj"));
		names.add(new String("Rohit"));
		System.out.println(names);
		//System.out.println("Rohit".hashCode());
		//names.remove("Rohit");
		System.out.println(names);
	}

}
