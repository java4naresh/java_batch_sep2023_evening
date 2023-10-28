package com.naresh.corejava.polymorphism;

public class DynamicPolymorphismClient {

	public static void main(String[] args) {
		Father f = new Father();
		f.earnMoney();
		Son s = new Son();
		s.earnMoney();

	}

}
