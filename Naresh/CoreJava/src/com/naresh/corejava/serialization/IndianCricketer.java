package com.naresh.corejava.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class IndianCricketer implements Externalizable {
	
	private String name;
	private Integer age;
	private String playerType;
	private String dob;
	private Integer noOfMatches;
	
	public IndianCricketer(String name, int age, String playerType, String dob, int noOfMatches) {
		super();
		this.name = name;
		this.age = age;
		this.playerType = playerType;
		this.dob = dob;
		this.noOfMatches = noOfMatches;
	}
	
	public IndianCricketer() {
		
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

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	@Override
	public String toString() {
		return "IndianCricketer [name=" + name + ", age=" + age + ", playerType=" + playerType + ", dob=" + dob
				+ ", noOfMatches=" + noOfMatches + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = (String)in.readObject();
		this.playerType = (String)in.readObject();
		//this.noOfMatches = in.readInt();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);
		out.writeObject(this.playerType);
		//out.writeInt(this.noOfMatches);
		
	}
	
	

}
