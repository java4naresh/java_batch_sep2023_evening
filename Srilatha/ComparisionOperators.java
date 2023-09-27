class ComparisionOperators 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 10;
		boolean result = num1 == num2;
		System.out.println(result);
		result = num1 != num2;
		System.out.println(result);
		num1 = 5;
		result = num1 < num2;
		System.out.println(result);
		num1 = 20;
        	result = num1 > num2;
		System.out.println(result);
		num1 = 45;
                result = num1 <= num2;
		System.out.println(result);
		num1 = 11;
		result = num2 >= num1;
        	System.out.println(result);

	}
}