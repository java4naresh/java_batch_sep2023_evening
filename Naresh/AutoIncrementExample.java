class AutoIncrementExample 
{
	public static void main(String[] args) 
	{
		int num = 5;
		//System.out.println(num);//5
		//num++;
		//++num;
        //System.out.println(++num);//6
		//num++;
		//++num;
		//System.out.println(++num);//7
        //num++;
		//++num;
		//System.out.println(++num);//8
		//System.out.println(num);//8
		//int sum = ++num + ++num + num++ + num + ++num;//6 + 7 + 7 + 8 + 9 = 37
		//int sum = num++ + num;//5 + 6
		//int sum = num + num++ + ++num + num;//5 + 5 + 7 + 7
		int sum = num++ + num++ + ++num + num;//5 + 6 + 8 + 8
		System.out.println(sum);
		System.out.println(num);
	}
}
