package com.naresh.corejava.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		linkedHashMapExample();

	}
	
	public static void linkedHashMapExample() {
		Map<String, Integer> palyerOrder = new LinkedHashMap<>();
		palyerOrder.put("Rohit", 1);
		palyerOrder.put("Ishan", 1);
		palyerOrder.put("Gill", 2);
		palyerOrder.put("Kohli", 3);
		palyerOrder.put("Shreyas", 4);
		palyerOrder.put("Gill", 5);
		palyerOrder.put("Surya", 6);
		palyerOrder.put("Jadeja", 7);
		palyerOrder.put(null, 12);
		palyerOrder.put(null, 13);
		palyerOrder.put("Sehwag", 1);
		System.out.println(palyerOrder);
		System.out.println(palyerOrder.get("Shreyas"));
		System.out.println(palyerOrder.keySet());
	}
	
	public static void hashMapExample() {
		Map<Integer, String> battingOrder = new HashMap<>();
		battingOrder.put(1, "Rohit");
		battingOrder.put(1, "Ishan");
		battingOrder.put(2, "Gill");
		battingOrder.put(3, "Kohli");
		battingOrder.put(4, "Shreyas");
		battingOrder.put(5, "Gill");
		battingOrder.put(6, "Surya");
		battingOrder.put(7, "Jadeja");
		battingOrder.put(null, "Shami");
		battingOrder.put(null, "Siraj");
		battingOrder.put(1, "Sehwag");
		System.out.println(battingOrder);
		System.out.println(battingOrder.get(1));
		System.out.println(battingOrder.get(10));
		System.out.println(battingOrder.keySet());
	}

}
