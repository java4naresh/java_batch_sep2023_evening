class DuplicateArrayValues
{
	public static void main(String[] args) 
	{
		int[] numbers = { 1, 2, 1, 3, 5, 3, 9, 6, 7, 6 };
		{
		System.out.println("Duplicate values in the array");
		}
        for (int i=0;i<numbers.length;i++)
			{
        for (int j=i+1;j<numbers.length;j++)
			{
			if (numbers[i] == numbers[j])
				{
System.out.println(numbers [i]);
	}
}
		}
	}
}

