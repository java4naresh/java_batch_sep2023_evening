package com.naresh.corejava.polymorphism;

public class TourSeeker {

	public static void main(String[] args) {
		TourPlan tp = new TourPlan("Mahindra Holidays");
		Flight flight = new Flight();
		tp.tour(flight);
        
	}

}
