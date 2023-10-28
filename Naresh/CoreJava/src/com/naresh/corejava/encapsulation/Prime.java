package com.naresh.corejava.encapsulation;

public class Prime {

	public static void main(String[] args) {
		PrimeUser user = new PrimeUser("naresh", "Naresh@123");
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());

	}

}
