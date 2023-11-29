package com.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		genericArraylistExample();
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
