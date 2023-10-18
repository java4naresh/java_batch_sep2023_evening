package com.naresh.corejava.hasarelation;

public class PersonClient {

	public static void main(String[] args) {
		Car car = new Car("XUV7oo", "Mahindra", "White");
		Person naresh = new Person("Naresh", car);
		naresh.longDrive("Tirupati");

	}

}
