package com.naresh.corejava.classobject;

public class HDFCBankCustomer {
	
	String customerName;
	char customerGender;
	int customerAge;
	long customerAccountNumber;
	double customerBalance;
	
	static String bankName;
	static String bankCode;
	
	public HDFCBankCustomer(String customerName, char customerGender, int customerAge, long customerAccountNumber,
			double customerBalance) {
		this.customerName = customerName;
		this.customerGender = customerGender;
		this.customerAge = customerAge;
		this.customerAccountNumber = customerAccountNumber;
		this.customerBalance = customerBalance;
	}

	static {
		bankName = "HDFC Bank";
		bankCode = "HDFC";
	}
	
	public void withDrawAmount(double amount) {
		if(amount <= customerBalance) {
			customerBalance = customerBalance - amount;
			System.out.println("take your amount");
			System.out.println("your amount balance = "+customerBalance);
		} else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void depositeAmount(double amount) {
			customerBalance = customerBalance + amount;
			System.out.println("Amount is deposited successfully");
			System.out.println("your amount balance = "+customerBalance);
	
	}
	
	public static void main(String[] args) {
		System.out.println(HDFCBankCustomer.bankCode);
		System.out.println(HDFCBankCustomer.bankName);
		HDFCBankCustomer customer = new HDFCBankCustomer("Naresh", 'M', 30, 123456789, 100000);
		System.out.println(customer);
		customer.withDrawAmount(10000);//method calling
		customer.depositeAmount(25000);//method calling
		System.out.println("=====================");
		HDFCBankCustomer customer2 = new HDFCBankCustomer("Srinivas", 'M', 28, 123456787, 150000);
		System.out.println(customer2);
		customer2.withDrawAmount(10000);//method calling
		customer2.depositeAmount(25000);//method calling
	}

	@Override
	public String toString() {
		return "HDFCBankCustomer [customerName=" + customerName + ", customerGender=" + customerGender
				+ ", customerAge=" + customerAge + ", customerAccountNumber=" + customerAccountNumber
				+ ", customerBalance=" + customerBalance + "]";
	}

}
