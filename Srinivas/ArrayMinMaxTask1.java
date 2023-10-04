class  ArrayMinMaxTask1
{
	public static void main(String[] args) 
	{
		int[] numbers = {95,60,55,22,33,12,100};
		int min = numbers[0];
		int max = numbers[0];
		for (int i=0;i<numbers.length;i++)
		{
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
		    if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		   System.out.println("minimum number is" + min);
		   System.out.println("maximum number is" + max);
			}
	}