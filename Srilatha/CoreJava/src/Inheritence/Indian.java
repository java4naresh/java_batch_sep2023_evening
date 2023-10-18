package Inheritence;

public class Indian {
	String state;
	String sunRiseTime;
	


public Indian(String state, String sunRiseTime) {
	this.state=state;
	this.sunRiseTime=sunRiseTime;
	
}


public void northIndianState(String poojaTime) {
	System.out.println("state near to Himalayas "+state+ " has early sunrise at " +sunRiseTime+ " ");
	System.out.println("people watch sunrise");
	System.out.println("pooja complete before sunrise" +poojaTime);
	

}
}
