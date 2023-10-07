import java.util.*;

	class ATMProgram{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int actualPin = 1432;
		System.out.println("Enter Pin number");
		int enteredPin = sc.nextInt();
		double availableBalance =5556.50;

		if(actualPin == enteredPin) {
		System.out.println("Welcome to ATM");
        	System.out.println("Available balance "+ availableBalance);
        	System.out.println("Enter Withdraw amount");
        	double withdrawAmount = sc.nextDouble();
        	if(withdrawAmount<=availableBalance) {
        	if(withdrawAmount%100==0) {
         	System.out.println("Please take your amount");
         	System.out.println("Your available balance is "+ (availableBalance-withdrawAmount));
		} else {
		System.err.println("Please enter 100's only");
		}
		} else {
		System.err.println("Insufficient funds");
		}
		} else {
		System.err.println("Soryy Wrong Pin number");
		}
	}
}