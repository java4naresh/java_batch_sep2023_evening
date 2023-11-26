package com.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		arrayListExample();
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
		Collections.sort(list);
		System.out.println(list);
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
