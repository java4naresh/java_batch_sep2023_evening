package com.srilatha.corejava.classobject;

public class Bank {
String bankName;
String address;
int totalMarketCap;
int employeeCount;

public static void main(String[] args){
    Bank sbi = new Bank();
    System.out.println(sbi);
    sbi.bankName = "SBI";
    sbi.address = "Narasaraopet";
    sbi.totalMarketCap = 6353;
    sbi.employeeCount = 10;
    System.out.println(sbi);
}
public String toString(){
  return "Bank[bankname="+bankName+", address="+address+", totalMarketCap="+totalMarketCap+", employeeCount="+employeeCount+"]";
}
}
