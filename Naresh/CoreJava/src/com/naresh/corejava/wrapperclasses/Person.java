package com.naresh.corejava.wrapperclasses;

public class Person {
	
	private String name;
	private Integer age;
	private Character gender;
	private Double salary;
	
	public Person() {
		super();
	}

	public Person(String name, Integer age, Character gender, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
	

}
