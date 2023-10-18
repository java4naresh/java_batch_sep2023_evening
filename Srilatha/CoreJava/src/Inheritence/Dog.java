package Inheritence;

public class Dog extends Animal{
	
		  Dog(String name) {
		    super(name, name);
		  }

		  void sound() {
		   super.sound();
		    System.out.println("The dog barks");
		  }

		  public static void main(String[] args) {
		    Dog dog = new Dog("Buddy");
		    dog.sound();
		  }
		}


