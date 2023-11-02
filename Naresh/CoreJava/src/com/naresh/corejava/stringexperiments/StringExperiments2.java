package com.naresh.corejava.stringexperiments;

public class StringExperiments2 {

	public static void main(String[] args) {
		String name = "Naresh";
		//String name2 = name + " Kambala";
		//String name2 = name.concat(" Kambala");
		//System.out.println(name2);
		//System.out.println(name);
		
		String name3 = "NaresH";
		String name4 = "naresh";
		System.out.println(name3.toLowerCase());//naresh
		System.out.println(name3.toUpperCase());//NARESH
		System.out.println(name3.charAt(0));//N
		System.out.println(name3.equals(name4));//false
		System.out.println(name3.equalsIgnoreCase(name4));//true
		System.out.println(name3);//NaresH
		
		String word1 = "nanna";
		String word2 = "amma";
		System.out.println(word2.compareTo(word1));
		
		if(word1.compareTo(word2) < 0) {
			System.out.println(word1 +", "+ word2);
		} else {
			System.out.println(word2 +", "+ word1);
		}
		
		String word = "Naresh Pavan Srinivas Amulya Akhil Srilatha Shyamala";
		
		System.out.println(word.contains("Sathish"));
		if(word.contains("Sathish")) {
			System.out.println("Present");
		} else {
			System.out.println("Absent");
		}
		
		String name5 = "Java";
		System.out.println(name5.indexOf('a'));
		System.out.println(name5.lastIndexOf('a'));
		System.out.println(name5.endsWith("na"));
		System.out.println(name5.startsWith("Na"));
		String name6 = "Na";
		System.out.println(name6.isEmpty());
		
	}

}
