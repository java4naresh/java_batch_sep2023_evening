package com.naresh.corejava.collectionframework;

public class Cricketer implements Comparable<Cricketer> {
	
	private String name;
	private Integer age;
	private Integer noOfMatches;
	private Integer rank;
	
	public Cricketer(String name, Integer age, Integer noOfMatches, Integer rank) {
		super();
		this.name = name;
		this.age = age;
		this.noOfMatches = noOfMatches;
		this.rank = rank;
	}

	public Cricketer() {
		super();
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

	public Integer getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", noOfMatches=" + noOfMatches + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Cricketer c) {
		
		return this.name.compareTo(c.getName());
	}
	
	
	

}
