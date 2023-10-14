package com.srilatha.corejava.classobject;

public class SbiBankCustomer {
String customerName;
char customerGender;
int customerAge;
long customerAccountNumber;
double customerBalance;



static String bankName;
static int bankCode;

public SbiBankCustomer(String customerName,char customerGender,int customerAge,long customerAccountNumber,double customerBalance) {
	
	this.customerName=customerName;
	this.customerGender=customerGender;
	this.customerAge=customerAge;
	this.customerAccountNumber=customerAccountNumber;
	this.customerBalance=customerBalance;
}


	static {
		bankName="StateBankOfIndia";
		bankCode=11067;
	}
	public void WithDrawAmount(double amount) {
		if(amount <= customerBalance) {
			customerBalance=customerBalance-amount;
			System.out.println("Take your amount");
			System.out.println("your amount balance is="+customerBalance);
		}else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void depositAmount(double amount) {
		customerBalance=customerBalance-amount;
		System.out.println("Amount is deposited succesfully");
		System.out.println("your amount balance is="+customerBalance);
		
	}
	public static void main(String args[]) {
		
		System.out.println(SbiBankCustomer.bankCode);
		System.out.println(SbiBankCustomer.bankName);
		SbiBankCustomer customer=new SbiBankCustomer("Srilatha",'F',23,234567865,100000);
		System.out.println(customer);
		customer.WithDrawAmount(10000);
		customer.depositAmount(20000);
		System.out.println("......");
	
	}
	
	public String toString() {
		return"SbiBankCustomer[customerName="+customerName+",customerGender="+customerGender+",customerAge="+customerAge
				+",customerAccountNumber="+customerAccountNumber+",customerBalance="+customerBalance+"]";
	}
	
}

