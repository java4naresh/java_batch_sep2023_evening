package com.naresh.corejava.polymorphism;

import com.naresh.corejava.encapsulation.PrimeUser;

public class ObjectExperiments {
	
	public static void experiment1(Object obj) {
		System.out.println(obj.getClass());
	}
	
	public static Object experiment2() {
		//return "Naresh";
		//return 1;
		//return 'c';
		return new PrimeUser("pawan", "Naresh@123");
	}
	
	public static void experiment3(Parent obj) {
		System.out.println(obj);
	}

}
