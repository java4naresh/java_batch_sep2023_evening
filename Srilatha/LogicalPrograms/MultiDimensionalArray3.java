import java.util.Arrays;
class MultiDimensionalArray3 
{
	public static void main(String[] args) 
	{
		int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		
        	System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));
		for(int i=0;i<numbers.length; i++) { 
		for(int j=0;j<numbers[i].length;j++) {
		if(j==numbers[i].length-1) {
		int temp = numbers[i][j];
		numbers[i][j] = numbers[0][j];
        	numbers[0][j] = temp;
		}
		}
		}
        	}
}