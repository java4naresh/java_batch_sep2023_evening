class ArithmeticOperatorsExamples 
{
	public static void main(String[] args) 
	{
		int num1 = 10; 
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers ="+sum);
		num1 = 20;
		num2 = 5;
		int sub = num1 - num2;
        System.out.println("Substraction of 2 numbers ="+sub);
		num1 = 5;
		num2 = 2;
		int mul = num1*num2;//10
		System.out.println("Multiplication of 2 numbers ="+mul);
		num1 = 18;
		num2 = 10;
		int div = num1/num2;//1
		int rem = num1%num2;//8
		System.out.println("div = "+div);
		System.out.println("rem = "+rem);
	}
}
