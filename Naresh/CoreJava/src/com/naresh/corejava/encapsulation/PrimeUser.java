package com.naresh.corejava.encapsulation;

public class PrimeUser {
	
	private String userName;
	
	private String password;

	public PrimeUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassWord() {
		//return password.replaceAll("[A-Za-z0-9]+", "x");
		return password;
	}
	
	
	public boolean equals(PrimeUser user) {
	        if(this == user) return true;
	        else if(this.userName.equals(user.getUserName()) 
	        		&& this.password.equals(user.getPassWord()))
	        	return true;
	        return false;
	        
	}


}
