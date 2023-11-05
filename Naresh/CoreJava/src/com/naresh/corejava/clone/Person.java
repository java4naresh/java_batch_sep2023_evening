package com.naresh.corejava.clone;

public class Person implements Cloneable {
	
	private String name;
	
	private int age;
	
	private Address address;

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	public Person clone() throws CloneNotSupportedException {
		//deep cloning
		/*Address ad = new Address(this.address.getHno(), this.address.getStreetName(), this.address.getVillageName(), this.address.getMandal(), this.address.getDistrict(), this.address.getCity(), this.address.getState(), this.address.getPincode());
		Person p = new Person(this.name, this.age, ad);
		return p;*/
		return (Person)super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("1-152", "navodaya colony", "Kukatpally", "Kukatpally", "Ranga reddy", "Hyderabad", "Telangana", 500072);
		Person p = new Person("Naresh", 30, address);
		Person p2 = (Person)p.clone();
	    System.out.println(p);
	    System.out.println(p2);
	    p2.getAddress().setState("AP");
	    System.out.println(p);
	    System.out.println(p2);

	}

}
