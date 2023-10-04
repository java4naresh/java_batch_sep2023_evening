class LogicalAndOperatorExample 
{
	public static void main(String[] args) 
	{
		int num1 = 8;
		int num2 = 12;
		int num3 = 14;
        boolean finalResult1 = num1%2==0 && num2%2==0 && num3%2==0;//true
		System.out.println(finalResult1);
		int num4 = -1;
		int num5 = 3;
		boolean finalResult2 = num4 > 0 && num5 > 0;//false
		System.out.println(finalResult2);
        boolean finalResult3 = finalResult1 && finalResult2;//true && false
		System.out.println(finalResult3);//false
	}
}
