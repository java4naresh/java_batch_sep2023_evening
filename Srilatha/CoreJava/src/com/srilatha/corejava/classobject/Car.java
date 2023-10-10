package com.srilatha.corejava.classobject;

public class Car {
String color;
String brand;
int engineCC;
int seatingCapacity;
double price;

public static void main(String[] args){
    Car jaguar = new Car();
    System.out.println(jaguar);
    jaguar.color = "BLUE";
    jaguar.brand = "TATA brand"; 
    jaguar.engineCC = 2179;
    jaguar.seatingCapacity = 5;
    jaguar.price = 1.20;
    System.out.println(jaguar);
}
public String toString(){
  return "Car[color="+color+", brand="+brand+", engineCC="+engineCC+", seatingCapacity="+seatingCapacity+", price="+price+"]";
}
}