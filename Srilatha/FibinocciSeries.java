class FibinocciSeries
{
	public static void main(String[] args) 
	{
	int num1 = 0, num2 = 1;

	System.out.print("Fibonacci Series" + num1 + ", " + num2);

	for (int i=2; num1 + num2<= 100; i++) {
    	int num= num1 + num2;
    	System.out.print(", " + num);
   	num1 = num2;
    	num2 = num;
}
}
}
