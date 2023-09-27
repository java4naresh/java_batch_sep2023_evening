import java.util.*;

class SwitchCase1
{
	public static void main(String[] args) 
	{
		Scanner e=new Scanner(System.in);
		System.out.println("Enter any Character");
		

		char ch=e.next().charAt(0);
       		switch(ch) {
		case 'a': System.out.println("Argon"); break;
		case 'b': System.out.println("Boron"); break;
		case 'c': System.out.println("Calicium"); break;
		case 'd': System.out.println("Dobrium"); break;
		case 'e': System.out.println("Europium"); break;
		case 'f': System.out.println("fermium"); break;
		case 'g': System.out.println("Gold"); break;
		case 'h': System.out.println("helium"); break;
		case 'i': System.out.println("iranium"); break;
		default : System.out.println("Elements");
		}
	}
}