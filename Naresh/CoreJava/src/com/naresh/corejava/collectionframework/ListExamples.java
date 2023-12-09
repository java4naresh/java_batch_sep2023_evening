package com.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.function.UnaryOperator;

public class ListExamples {
	
	public static void main(String[] args) {
		customObjects();
	}
	
	public static void customObjects() {
		/*Orders order1 = new Orders(1,"Mobile", 1);
		Orders order2 = new Orders(2,"Sun glasses", 2);
		Orders order3 = new Orders(3,"Shoes", 4);
		Orders order4 = new Orders(4,"Chairs", 2);
		Orders order5 = new Orders(5,"Jeans", 4);
		List<Orders> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order2);
		System.out.println(orders);
		//orders.remove(1);
		orders.remove(new Orders(2, "Sun glasses", 2));
		System.out.println(orders);
		
		Orders order6 = new Orders(2,"T-Shirt", 2);
		boolean result = order2.equals(new Orders(2, "Sun glasses", 2));
		System.out.println(result);//true*/
		//Cricketer c1 = new Cricketer("Rohit", 36, 250, 15);
		List<Cricketer> customers = new ArrayList<>();
		customers.add(new Cricketer("Rohit", 36, 250, 15));
		customers.add(new Cricketer("Kohli", 35, 270, 5));
		customers.add(new Cricketer("Gill", 25, 20, 1));
		customers.add(new Cricketer("Siraj", 28, 50, 2));
		customers.add(new Cricketer("Rahul", 26, 52, 16));
		System.out.println(customers);
		//Collections.sort(customers);
		//Collections.sort(customers, new CricketerAgeSorting());
		//Collections.sort(customers, new NoOfMatchesSorting());
		Collections.sort(customers, new RankBasedSorting());
		System.out.println(customers);
		
	}
	
	public static void utilityMethods() {
		
		Integer[] numbers = {1,2,3,4,5,6};
		
		List<Integer> list = Arrays.asList(numbers);
		
		System.out.println(list);
	}
	
	public static void genericVector() {
		List<Character> vowels = new Vector<>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('E');
		System.out.println(vowels);
		/*char check = 'a';
		if(vowels.contains(check)) {
			System.out.println("vowel");
		} else {
			System.out.println("consonent");
		}*/
		List<Character> smallCases = vowels.subList(5, 10);
		System.out.println(smallCases);
		System.out.println(Arrays.toString(vowels.toArray()));
	}
	
	public static void genericLinkedList() {
		List<String> crickers = new LinkedList<>();
		crickers.add("Rohit");
		crickers.add("Kohli");
		crickers.add("Gill");
		crickers.add("Shreyas");
		crickers.add("Rahul");
		crickers.add("Surya");
		crickers.add("Jadeja");
		crickers.add("Shami");
		crickers.add("Kuldeep");
		crickers.add("Bumra");
		crickers.add("Siraj");
		crickers.add("Rohit");
		System.out.println(crickers);
		System.out.println(crickers.get(10));
		List<String> extraPlayers = new ArrayList<>();
		extraPlayers.add("Ashwin");
		extraPlayers.add("Ishan");
		extraPlayers.add("Shardul");
		extraPlayers.add("Hardik");
		System.out.println(extraPlayers);
		crickers.addAll(extraPlayers);
		System.out.println(crickers);
		System.out.println(crickers.containsAll(extraPlayers));
		//crickers.removeAll(extraPlayers);
		System.out.println(crickers);
	}
	
	public static void genericArraylistExample() {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(15);
		System.out.println(list);
		//list.remove(3);//index
		//list.remove((Integer)30);//removing value directly
		//list.add(2, 5);//if we want to add value in a perticular index
		//list.clear();//if we want to empty the list we will use clear method
		//System.out.println(list.contains(10));//if we want to check perticular value present in list
		//System.out.println(list.indexOf(5));
		System.out.println(list.isEmpty());
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
	}
	
	public static void arrayListExample() {
		List list = new ArrayList();
		list.add(10);
		list.add("Naresh");
		list.add(100.00);
		list.add('M');
		list.add(false);
		list.add(10);
		list.add("Naresh");
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
	}

}
