package com.naresh.corejava.clone;

public class CloneClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("1-152", "navodaya colony", "Kukatpally", "Kukatpally", "Ranga reddy", "Hyderabad", "Telangana", 500072);
		Person p = new Person("Naresh", 30, address);
		Person p2 = p.clone();
	    System.out.println(p);
	    System.out.println(p2);
	    p2.getAddress().setState("AP");
	    System.out.println(p);
	    System.out.println(p2);

	}

}
