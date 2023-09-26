import java.util.Scanner;

class ForLoopExample 
{
	public static void main(String[] args) 
	{

		/*for (int i=1; i<11; i++)
		{
			System.out.println("Hello World"+i);
		}*/

        /*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int myChoice = sc.nextInt();
        System.out.println("Enter Message");
		String message = sc.next();
		for (int i=1; i<myChoice; i++)
		{
			System.out.println(message+i);
		}*/

		/*for (int i=1; i<11; i++)
		{
			System.out.println("*");
		}*/

        // 5 table
        /*for (int i=1; i<11; i++)
		{
			System.out.println("5*"+i+"="+(5*i));//5*1=5
		}*/

        /*for (int i=1; i<501; i++)
		{
			System.out.println(i);
		}*/

		/*for(int i=500;i>=1; i--) {
		System.out.println(i);
		}*/
        
		/*for (int i=1; i<101; i++)
		{
			if(i%2!=0) {
			System.out.println(i);
			}
		}*/

		/*for (int i=1; i<101; i++)
		{
			if(i%2==0) {
			System.out.println("Even="+i);
			} else {
			System.out.println("Odd="+i);
			}
		}*/

       /*for (int i=2; i<101; i=i+2)
		{
			System.out.println(i);	
		}*/

       /*for (int i=0; i<101; i=i+5)
		{
			System.out.println(i);	
		}*/

		int num = 10;//1,20(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19)
        //boolean flag = true;
		int divisionCount = 0;
		for(int i=1; i<=num; i++) {//10<=10
		if(num%i==0) {//10%10
		//flag = false;
        divisionCount++;
		}
		}
        
		if(divisionCount==2) System.out.println(num+" is Prime");
		else System.out.println(num+" is Not Prime");


		
		
	}
}
