package com.naresh.corejava.polymorphism;

public class TourPlan {
	
	String companyName;

	public TourPlan(String companyName) {
		super();
		this.companyName = companyName;
	}
	
	public void tour(Bus bus) {
       System.out.println("by bus");
	}
	
	public void tour(Car car) {
		 System.out.println("by car");
	}
	
	public void tour(Train train) {
		 System.out.println("by train");
	}
	
	public void tour(Flight flight) {
		 System.out.println("by flight");
	}

}
