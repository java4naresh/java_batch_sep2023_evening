package com.naresh.corejava.wrapperclasses;

public class PersonClient {

	public static void main(String[] args) {
		Person p = new Person();
		int age = 20;
		//auto boxing
		p.setAge(age);
		//auto un boxing
		int age2 = p.getAge();
		double salary = 10000.0;
		//auto boxing
		p.setSalary(salary);
		//auto un boxing
		double salary2 = p.getSalary();
		System.out.println(p);
		
		String strNumber = "1000";
		//Integer number = new Integer(strNumber);
		//int div = number / 10;
		int number = Integer.parseInt(strNumber);
		String strSalary = "100000.00";
		Double d = new Double(strSalary);
		double salaryd = Double.parseDouble(strSalary);

	}

}
