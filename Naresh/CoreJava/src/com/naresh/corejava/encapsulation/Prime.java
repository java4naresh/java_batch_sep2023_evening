package com.naresh.corejava.encapsulation;

public class Prime {

	public static void main(String[] args) {
		PrimeUser user = new PrimeUser("naresh", "Naresh@123");//7852e922
		//System.out.println(user.getUserName());
		//System.out.println(user.getPassWord());
		PrimeUser user2 = new PrimeUser("pawan", "Naresh@123");//4e25154f
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user.equals(user2));
		
		Object obj = new PrimeUser("", "");//up casting
		Object obj2 = new Prime();
		
		//PrimeUser pm = new Object(); 
		
		PrimeUser pm2 = (PrimeUser)obj;// down casting
		
		Object name = "Naresh";
		Object number = 1;

	}

}
