package com.srilatha.corejava.classobject;

public class IndianVillages {
String name;
double width;
int totalPopulation;
int menPopulation;
int womenPopulation;
int childsCount;
String occupation;
String mandalName;
String district;
String state;
int pincode;
 
public static void main(String[] args){
    IndianVillages nrt= new IndianVillages();
    System.out.println(nrt);
    nrt.name = "Narasaraopet";
    nrt.mandalName ="Narasaraopet"; 
    nrt.district = "Palnadu";
    nrt.state = "AndhraPradesh";
    nrt.totalPopulation = 60000;
    nrt.pincode = 522601 ;
    System.out.println(nrt);
}
public String toString(){
  return "IndianVillages[name="+name+", mandalname="+mandalName+", district="+district+", state="+state+", totalPopulation="+totalPopulation+", pincode="+pincode+"]";
}
}
