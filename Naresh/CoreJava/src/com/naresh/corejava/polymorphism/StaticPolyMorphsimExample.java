package com.naresh.corejava.polymorphism;

public class StaticPolyMorphsimExample {
	
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}

	public int sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
		return num1+num2+num3;
	}

	public void sum(int num1, int num2, int num3, int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void main(String[] args) {
		StaticPolyMorphsimExample s = new StaticPolyMorphsimExample();
		s.sum(10, 20);
		s.sum(10, 20, 30);
		s.sum(10, 20, 3, 50);
	}

}
