package com.naresh.corejava.clone;

public class Address {
	
	private String hno;
	
	private String streetName;
	
	private String villageName;
	
	private String mandal;
	
	private String district;
	
	private String city;
	
	private String state;
	
	private int pincode;

	public Address(String hno, String streetName, String villageName, String mandal, String district, String city,
			String state, int pincode) {
		super();
		this.hno = hno;
		this.streetName = streetName;
		this.villageName = villageName;
		this.mandal = mandal;
		this.district = district;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streetName=" + streetName + ", villageName=" + villageName + ", mandal="
				+ mandal + ", district=" + district + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
	
	

}
