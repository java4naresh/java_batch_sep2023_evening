package com.naresh.corejava.abstraction;

public class Foodie {

	public static void main(String[] args) {
		
		Hotel hotel1 = new AnnapurnaHotel();
		Hotel hotel2 = new BalajiHotel();
		hotel1.idly();
		hotel2.idly();

	}

}
