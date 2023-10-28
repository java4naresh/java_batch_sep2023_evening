package com.naresh.corejava.polymorphism;

public class Order {
	
	String orderName;
	int quantity;
	double price;
	String address;
	public Order(String orderName, int quantity, double price, String address) {
		super();
		this.orderName = orderName;
		this.quantity = quantity;
		this.price = price;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", quantity=" + quantity + ", price=" + price + ", address=" + address
				+ "]";
	}

}
