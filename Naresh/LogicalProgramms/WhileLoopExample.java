class WhileLoopExample 
{
	public static void main(String[] args) 
	{
		/*int num = 1;
		while(num<6) {
		System.out.println(num);
		num++;
		}*/

		/*int checkPrime = 10;
		int start = 1;
		int divisionCount = 0;
		while(start<=checkPrime) {
		if(checkPrime%start==0) {
		//flag = false;
        divisionCount++;
		}
		start++;
		}

		if(divisionCount<=2) System.out.println(checkPrime+" is Prime");
		else System.out.println(checkPrime+" is Not Prime");*/

        //WAP to find given number is polindrome or not
		/*int num = 256;//656%10=6,656/10=65,65%10=5,65/10=6,6%10=6,6/10=0
        int backup = num;
		int reverse = 0;
		while(num!=0) {//656!=0(true),65!=0(true),6!=0(true),0!=0(false)
			int rem = num%10;//656%10=6,65%10=5,6%10=6
			num = num/10;//656/10=65,65/10=6,6/10=0
			reverse = (reverse*10)+rem;//(0*10)+2=,(2*10)+5=25,(25*10)+8=258 
		}
        System.out.println(reverse);
		if(reverse==backup) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");*/
        
		/*int num = 256;//656%10=6,656/10=65,65%10=5,65/10=6,6%10=6,6/10=0
        String backup = num+"";
		String reverse = "";
		while(num!=0) {//656!=0(true),65!=0(true),6!=0(true),0!=0(false)
			int rem = num%10;//656%10=6,65%10=5,6%10=6
			num = num/10;//656/10=65,65/10=6,6/10=0
			reverse = reverse+rem;//""+6->"6","65","656"
		}
        System.out.println(reverse);
		if(reverse==backup) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");*/

		//WAP to find out given number is armstrong or not

		/*int num = 153;
        int backup = num;
        int sum = 0;
        while(num!=0) {
          int rem = num%10;
          num = num/10;
          sum = sum+(rem*rem*rem);
        }
       if(sum==backup) System.out.println("armstrong");
       else System.out.println("it is not armstrong");*/

	   //WAP to find armstrong numbers from 1 to 1000
       for(int i=1;i<1001;i++) {
        int num = i;
        int backup = num;
        int sum = 0;
        while(num!=0) {
          int rem = num%10;
          num = num/10;
          sum = sum+(rem*rem*rem);
        }
       if(sum==backup) System.out.println("armstrong number is "+backup);
	   }

	}
}
