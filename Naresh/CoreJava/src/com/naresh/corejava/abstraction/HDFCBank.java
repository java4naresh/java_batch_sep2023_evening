package com.naresh.corejava.abstraction;

public class HDFCBank implements Bank {

	@Override
	public void openSavingsAccountRules() {
		System.out.println("Need Aadhar");
		System.out.println("Need Pan Card");
		System.out.println("interest is 2%");
		System.out.println("Maintain minimum amount of 1000");
		
	}

	@Override
	public void openCurrentAccountRules() {
		System.out.println("Need Aadhar");
		System.out.println("Need Pan Card");
		System.out.println("Need business details");
		System.out.println("yearly charges 1%");
	}

	@Override
	public void applyHomeLoanRules() {
		System.out.println("Need Aadhar");
		System.out.println("Need Pan Card");
		System.out.println("Need Payslips of 6 months");
		System.out.println("need 5 years of bank statements");
		System.out.println("cibil score should be good");
		System.out.println("property documents");
	}

	@Override
	public void applyPersonalLoanRules() {
		System.out.println("Need Aadhar");
		System.out.println("Need Pan Card");
		System.out.println("Need Payslips of 6 months");
		System.out.println("need 5 years of bank statements");
		System.out.println("cibil score should be good");
		
	}

}
