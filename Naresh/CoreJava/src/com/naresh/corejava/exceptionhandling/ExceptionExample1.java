package com.naresh.corejava.exceptionhandling;

import com.naresh.corejava.wrapperclasses.Person;

public class ExceptionExample1 {

	public static void main(String[] args) {
		ExceptionExample1.arithmeticExceptionExample();
		ExceptionExample1.nullPointerExceptionExample();
		ExceptionExample1.arrayIndexOutOfBoundsExceptionExample();
		ExceptionExample1.stringIndexOutOfBoundsExceptionExample();
		System.out.println("Naresh");
	}
	
	public static void stringIndexOutOfBoundsExceptionExample() {
		try {
		String name = "Naresh";
		System.out.println(name.charAt(6));
		} catch(Exception e) {
			//System.out.println("got exception");
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void arrayIndexOutOfBoundsExceptionExample() {
		try {
		int[] numbers = {10,20,30,40,50};//0,1,2,3,4
		System.out.println(numbers[4]);//50
		System.out.println(numbers[5]);
		} catch(Exception e) {
			//System.out.println("got exception");
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void nullPointerExceptionExample() {
		try {
		String name = "Naresh";
		System.out.println(name.toUpperCase());
		Person p = null;
		System.out.println(p.getAge());
		} catch(NullPointerException ae) {
			
		} catch(Exception e) {
			//System.out.println("got exception");
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void arithmeticExceptionExample() {
		try {
		int div = 10/0;
		System.out.println(div);
		System.out.println("Naresh");
		} catch(ArithmeticException ae) {
			
		} catch(Exception e) {
			//System.out.println("got exception");
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception handled");
		}
	}

}
