package com.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class MapExamples {

	public static void main(String[] args) {
		customObjectsMap();
		//System.out.println(1 << 30);

	}
	
	public static void mapSortingExample() {
		Map<String, Long> marketCap = new HashMap<>();
		marketCap.put("TCS", 1412760l);
		marketCap.put("Infosys", 655105l);
		marketCap.put("Reliance", 1688444l);
		marketCap.put("Adani Enterprises", 341066l);
		marketCap.put("Titan", 319652l);
		marketCap.put("Bata", 21164l);
		System.out.println(marketCap);
		Set<String> keySet = marketCap.keySet();
		System.out.println(keySet);
		//Set<String> sortedKeys = new TreeSet<>(keySet);
		//sortedKeys.addAll(keySet);
		List<String> sortingKeys = new ArrayList<>(keySet);
		System.out.println(sortingKeys);
		Collections.sort(sortingKeys, new StringDescOrderComparator());
		Map<String, Long> sortedMap = new LinkedHashMap<>();
		for(String key:sortingKeys) {
			sortedMap.put(key, marketCap.get(key));
		}
		System.out.println(sortedMap);
		
	}
	
	public static void mapIteration() {
		Map<Integer, String> battingOrder = new ConcurrentHashMap<>();
		battingOrder.put(1, "Rohit");
		battingOrder.put(1, "Ishan");
		battingOrder.put(2, "Gill");
		battingOrder.put(3, "Kohli");
		battingOrder.put(4, "Shreyas");
		battingOrder.put(5, "Gill");
		battingOrder.put(6, "Surya");
		System.out.println(battingOrder);
		//[1, 2, 3, 4, 5, 6]
		/*battingOrder.remove(1);
		System.out.println(battingOrder);*/
		Set<Integer> keys = battingOrder.keySet();
		Iterator<Integer> keyItr = keys.iterator();
		while(keyItr.hasNext()) {
			Integer key = keyItr.next();
			String value = battingOrder.get(key);
			System.out.println(key+"="+value);
			battingOrder.put(key, value+key);
			//battingOrder.remove(key);
		}
		System.out.println(battingOrder);
		
		
	}
	
	public static void customObjectsMap() {
		/*Map<Integer, Course> courses = new HashMap<>();
		courses.put(101, new Course(101, "Java", 20000));
		courses.put(102, new Course(102, "Python", 20000));
		courses.put(103, new Course(103, "Java Script", 20000));
		courses.put(104, new Course(104, "C", 20000));
		courses.put(105, new Course(105, "C++", 20000));
		courses.put(106, new Course(106, "C#", 20000));
		System.out.println(courses);*/
		
		Map<Course, String> faculty = new HashMap<>();
		faculty.put(new Course(101, "Java", 20000), "Naresh");
		faculty.put(new Course(102, "Python", 20000), "Pavan");
		faculty.put(new Course(103, "Java Script", 20000), "Srilatha");
		faculty.put(new Course(104, "C", 20000), "Naresh");
		faculty.put(new Course(106, "C#", 20000), "Shyamala");
		faculty.put(new Course(101, "java", 20000), "Naresh");
		faculty.put(new Course(101, "Java", 20000), "Naresh");
		System.out.println(faculty);
		System.out.println(faculty.get(new Course(101, "Java", 20000)));
		Set<Entry<Course, String>> entrySet = faculty.entrySet();
		Iterator<Entry<Course, String>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()) {
			Entry<Course, String> entry = entryItr.next();
			System.out.println(entry.getKey() + "="+entry.getValue());
		}
		/*for(Entry<Course, String> entry : entrySet) {
			System.out.println(entry.getKey() + "="+entry.getValue());
		}*/
	}
	
	public static void complicatedMap() {
		Map<String, Integer> andhraPopulation = new HashMap<>();
		andhraPopulation.put("Male", 40000000);
		andhraPopulation.put("Female", 41000000);
		Map<String, Integer> telanganaPopulation = new HashMap<>();
		telanganaPopulation.put("Male", 25000000);
		telanganaPopulation.put("Female", 24000000);
		Map<String, Integer> tamilnaduPopulation = new HashMap<>();
		tamilnaduPopulation.put("Male", 5000000);
		tamilnaduPopulation.put("Female", 54000000);
		Map<String, Integer> karnatakaPopulation = new HashMap<>();
		karnatakaPopulation.put("Male", 45000000);
		karnatakaPopulation.put("Female", 44000000);
		Map<String, Integer> keralaPopulation = new HashMap<>();
		keralaPopulation.put("Male", 28000000);
		keralaPopulation.put("Female", 31000000);
		Map<String, Map<String, Integer>> statePopulation = new HashMap<>();
		statePopulation.put("Andhra", andhraPopulation);
		statePopulation.put("Telangana", telanganaPopulation);
		statePopulation.put("Tamilnadu", tamilnaduPopulation);
		statePopulation.put("Karnataka", karnatakaPopulation);
		statePopulation.put("Kerala", keralaPopulation);
		System.out.println(statePopulation);
	}
	
	public static void hashtableExample() {
		Map<String, String> stateCapitalMap = new Hashtable<>();
		//stateCapitalMap.put("Andhra", "Amaravati");
		stateCapitalMap.put("Hyderabad", "Telangana");
		stateCapitalMap.put("Chennai", "Tamilnadu");
		stateCapitalMap.put("Thiruvananthapuram", "Kerala");
		stateCapitalMap.put("Bangalore", "Karnataka");
		stateCapitalMap.put(null, "Andhra");
		System.out.println(stateCapitalMap);
		//{Chennai=Tamilnadu, Bangalore=Karnataka, Hyderabad=Telangana, Thiruvananthapuram=Kerala}
		//{null=Andhra, Chennai=Tamilnadu, Thiruvananthapuram=Kerala, Hyderabad=Telangana, Bangalore=Karnataka}
		
	}
	
	public static void treeMapExample() {
		Map<String, String> fruitColourMap = new TreeMap<>();
		fruitColourMap.put("Mango", "Yellow");
		fruitColourMap.put("Apple", "Green");
		fruitColourMap.put("Banana", "Yellow");
		fruitColourMap.put("Sapota", "Brown");
		fruitColourMap.put("Guava", "Green");
		fruitColourMap.put("Grape", "Black");
		System.out.println(fruitColourMap);
		//TreeMap
		//{Apple=Green, Banana=Yellow, Grape=Black, Guava=Green, Mango=Yellow, Sapota=Brown}
		//LinkedHashMap
		//{Mango=Yellow, Apple=Green, Banana=Yellow, Sapota=Brown, Guava=Green, Grape=Black}
	    // HashMap
		//{Guava=Green, Apple=Green, Grape=Black, Sapota=Brown, Mango=Yellow, Banana=Yellow}
		
		System.out.println(fruitColourMap.values());
		
		System.out.println(fruitColourMap.keySet().contains("Orange"));
		
		System.out.println(fruitColourMap.values().contains("Red"));
	
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
		Set<Entry<Integer, String>> entrySet = battingOrder.entrySet();
		Iterator<Entry<Integer, String>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()) {
			Entry<Integer, String> entry = entryItr.next();
			System.out.println(entry.getKey()+ "="+entry.getValue());
		}
	}

}
