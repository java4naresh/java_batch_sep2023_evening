package com.naresh.corejava.classobject;

public class Calculator {
	
	public int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public int substraction(int num1, int num2) {
		int sub = 0;
		if(num1 < num2) {
			sub = num2 - num1;
		} else {
			sub = num1 - num2;
		}
		return sub;
	}
	
	public int multiplication(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	
	public int division(int num1, int num2) {
		int div = 0;
		if(num1 < num2) {
			div = num2 / num1;
		} else {
			div = num1 / num2;
		}
		return div;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int sum = c.addition(10, 20);//method calling
		System.out.println(sum);
		int sub = c.substraction(15, 10);//method calling
		System.out.println(sub);
		int mul = c.multiplication(1, 2);//method calling
		System.out.println(mul);
		int div = c.division(5, 25);//method calling
		System.out.println(div);
		c.addition(50, 10);
		c.addition(89, 5);
	}

}
