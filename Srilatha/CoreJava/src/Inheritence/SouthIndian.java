package Inheritence;

public class SouthIndian {
 String name;
 Indian indian;
 public SouthIndian(String name, Indian indian) {
	 this.name=name;
	 this.indian=indian;
 }
 
 
 public void northIndianState(String poojaTime) {
	 indian.northIndianState(poojaTime);
 }
}




