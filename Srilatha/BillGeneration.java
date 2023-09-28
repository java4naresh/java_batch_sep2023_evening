import java.util.*;
class BillGeneration{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of units consumed");
	int units=sc.nextInt();
	double billAmount;

	if(units<=100){
	billAmount=units*2;
	}else if(units<=150){
	billAmount=150*2.5;
	}else if(units<=200){
	billAmount=200*3;
	}else {
	billAmount=250*4;
	}

	System.out.println("your power bill amount is"+billAmount);
}
}