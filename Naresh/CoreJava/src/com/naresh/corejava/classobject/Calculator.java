package com.naresh.corejava.classobject;

public class Calculator {
	
	public static int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int sumOfMyChoice(int... numbers) {
		int sum = 0;
		for(int num:numbers) {
			sum = sum + num;
		}
		return sum;
	}
	
	public static int substraction(int num1, int num2) {
		int sub = 0;
		if(num1 < num2) {
			sub = num2 - num1;
		} else {
			sub = num1 - num2;
		}
		return sub;
	}
	
	public static int multiplication(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	
	public static int division(int num1, int num2) {
		int div = 0;
		if(num1 < num2) {
			div = num2 / num1;
		} else {
			div = num1 / num2;
		}
		return div;
	}
	
	public static void main(String[] args) {
		//Calculator c = new Calculator();
		/*int sum = Calculator.addition(10, 20);//method calling
		System.out.println(sum);
		int sub = Calculator.substraction(15, 10);//method calling
		System.out.println(sub);
		int mul = Calculator.multiplication(1, 2);//method calling
		System.out.println(mul);
		int div = Calculator.division(5, 25);//method calling
		System.out.println(div);
		Calculator.addition(50, 10);
		Calculator.addition(89, 5);*/
		System.out.println(Calculator.sumOfMyChoice(10,20));//30
		System.out.println(Calculator.sumOfMyChoice(5, 8, 9, 6, 3));
		System.out.println(Calculator.sumOfMyChoice(5, 8, 9, 6, 3, 7, 3, 4, 2, 1));
	}

}
