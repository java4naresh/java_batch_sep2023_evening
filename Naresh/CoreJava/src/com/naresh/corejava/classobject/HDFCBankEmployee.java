package com.naresh.corejava.classobject;

public class HDFCBankEmployee {
	
	String employeeName;
	
	char employeeGender;
	
	int employeeAge;
	
	String employeeRole;
	
	static String bankName;
	static String bankCode;
	
	static {
		bankName = "HDFC Bank";
		bankCode = "HDFC";
	}
	
	public HDFCBankEmployee() {
		
	}
	
	public HDFCBankEmployee(String employeeName, char employeeGender, int employeeAge, String employeeRole) {
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeAge = employeeAge;
		this.employeeRole = employeeRole;
	}

	public void cashDeposite() {
		if(employeeRole == "Cashier") {
			System.out.println("I am the person to take money and deposite");
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
		HDFCBankEmployee naresh = new HDFCBankEmployee("Naresh", 'M', 30, "Manager");
		naresh.cashDeposite();//method calling by using object
		
		HDFCBankEmployee pavan = new HDFCBankEmployee("Pavan", 'M', 30, "Cashier");
		pavan.cashDeposite();//method calling by using object
	}

}
