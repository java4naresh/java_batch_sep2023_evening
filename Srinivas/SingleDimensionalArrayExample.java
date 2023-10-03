class SingleDimensionalArrayExample 
{
	public static void main(String[] args) 
	{
		int sumArray[] = {3,4,6,8,9,2};
		int sum = 0;
		for(int i=sumArray.length-1;0<=i;i--){
			sum = sum + sumArray[i];
		}
		System.out.println(sum);
	}
}
