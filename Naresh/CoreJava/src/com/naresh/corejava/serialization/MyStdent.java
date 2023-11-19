package com.naresh.corejava.serialization;

import java.io.Serializable;

public class MyStdent implements Serializable {
	
	private String name;
	private Character gender;
	private String dob;
	private Integer age;
	
	public MyStdent(String name, Character gender, String dob, Integer age) {
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
	}

	public MyStdent() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyStdent [name=" + name + ", gender=" + gender + ", dob=" + dob + ", age=" + age + "]";
	}

}
