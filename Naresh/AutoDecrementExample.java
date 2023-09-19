class AutoDecrementExample 
{
	public static void main(String[] args) 
	{
		int num = 5;
		/*System.out.println(num);//5
		num--;
        System.out.println(num);//4
		num--;
		System.out.println(num);//3
        num--;
		System.out.println(num);//2*/
		//int sum = --num + num-- + num;//4 + 4 + 3
		//int sum = num-- + --num + --num + num-- + num;//5 + 3 + 2 + 2 + 1
		//int sum = num++ + --num + num-- + ++num + num;//5 + 5 + 5 + 5 + 5
		int finalSum = num-- + num++ + ++num + num + --num + num-- + ++num;//5 + 4 + 6 + 6 + 5 + 5 + 5
		System.out.println(finalSum);//36
		System.out.println(num);//5
	}
}
