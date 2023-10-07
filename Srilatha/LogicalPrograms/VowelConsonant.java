import java.util.*;

class VowelConsonant{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a character");
	char ch=sc.next().charAt(0);
	
	if(ch == 'a' || ch=='A'||ch == 'e'||ch=='E' || ch == 'i' ||ch=='I' || ch == 'o'||ch=='O' || ch == 'u'||ch=='U') {
	System.out.println("Given character is vowel");
	} else {
	System.out.println("Given character is consonant");
	}

}
}