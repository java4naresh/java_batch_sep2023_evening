class ComparisionOperatorsExample 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 10;
		boolean status = num1 == num2;
		System.out.println(status);
		status = num1 != num2;
		System.out.println(status);
		num1 = 5;
		status = num1 < num2;
		System.out.println(status);
		num1 = 15;
        status = num1 > num2;//15 > 10
		System.out.println(status);
		num1 = 9;
        status = num1 <= num2;//9 <= 10 true
		System.out.println(status);
		num1 = 11;
		status = num2 >= num1;//10 >= 11 false
        System.out.println(status);

	}
}
