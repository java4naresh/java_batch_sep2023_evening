package com.naresh.corejava.hasarelation;

public class HDFCBankEmployee {
	
	String employeeName;
	
	char employeeGender;
	
	int employeeAge;
	
	String employeeRole;
	
	HDFCBankCustomer customer;
	
	static String bankName;
	static String bankCode;
	
	static {
		bankName = "HDFC Bank";
		bankCode = "HDFC";
	}
	
	public HDFCBankEmployee() {
		
	}
	
	public HDFCBankEmployee(String employeeName, char employeeGender, int employeeAge, String employeeRole, 
			HDFCBankCustomer customer) {
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeAge = employeeAge;
		this.employeeRole = employeeRole;
		this.customer = customer;
	}

	public void cashDeposite(double amount) {
		if(employeeRole == "Cashier") {
			System.out.println("I am the person to take money and deposite");
			customer.depositeAmount(amount);
		} else {
			System.out.println("I am not a Cashier");
		}
	}
	
	public static void loginTime() {
		System.out.println("Accoring to "+ bankName + " rules, every employee should come to bank by 10 'AM'");
	}
	
	public static void logoutTime() {
		System.out.println("Accoring to "+ bankName + " rules, every employee should leave the bank by 6 'PM'");
	}
	
	public static void main(String[] args) {
		HDFCBankEmployee.loginTime();//it is possible to call static methods using class name
		HDFCBankEmployee.logoutTime();//it is possible to call static methods using class name
		//HDFCBankEmployee.cashDeposite();it is not possible to call non static methods using class name
		HDFCBankCustomer customer = new HDFCBankCustomer("Naresh", 'M', 30, 123456789, 100000);
		System.out.println(customer);
		HDFCBankEmployee naresh = new HDFCBankEmployee("Naresh", 'M', 30, "Manager", customer);
		naresh.cashDeposite(20000);//method calling by using object
		
		HDFCBankEmployee pavan = new HDFCBankEmployee("Pavan", 'M', 30, "Cashier", customer);
		pavan.cashDeposite(20000);//method calling by using object
		System.out.println(customer);
	}

}
