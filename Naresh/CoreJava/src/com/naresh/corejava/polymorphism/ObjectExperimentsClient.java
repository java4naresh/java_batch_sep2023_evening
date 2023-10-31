package com.naresh.corejava.polymorphism;

import com.naresh.corejava.encapsulation.PrimeUser;

public class ObjectExperimentsClient {

	public static void main(String[] args) {
		ObjectExperiments.experiment1("Naresh");
		ObjectExperiments.experiment1(1);
		PrimeUser user2 = new PrimeUser("pawan", "Naresh@123");
		ObjectExperiments.experiment1(user2);
		
		ObjectExperiments.experiment3(new Parent());
		ObjectExperiments.experiment3(new Child1());
		ObjectExperiments.experiment3(new Child2());
		//ObjectExperiments.experiment3("");

	}

}
