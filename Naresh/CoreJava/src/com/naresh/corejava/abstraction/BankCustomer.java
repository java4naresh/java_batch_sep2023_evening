package com.naresh.corejava.abstraction;

public class BankCustomer {

	public static void main(String[] args) {
		
		Bank hdfcBank = new HDFCBank();
        hdfcBank.applyHomeLoanRules();
        System.out.println("==================");
        Bank iciciBank = new ICICIBank();
        iciciBank.applyHomeLoanRules();
	}

}
