import java.util.Arrays;

class MultiDimensionalArray 
{
	public static void main(String[] args) 
	{
		int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		/*System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);
		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]);*/

        /*for(int i=0;i<numbers.length; i++) { //0<3,1<3
		for(int j=0;j<numbers[i].length;j++) {//0<3,1<3,2<3,3<3(fail)
		System.out.println(numbers[i][j]);//numbers[0][0],numbers[0][1],numbers[0][2],numbers[1][0],numbers[1][1]
		}
		}*/
		//columns swapping
        /*System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));
		for(int i=0;i<numbers.length; i++) { 
		for(int j=0;j<numbers[i].length;j++) {
		if(j==numbers[i].length-1) {
		int temp = numbers[i][j];
		numbers[i][j] = numbers[i][0];
        numbers[i][0] = temp;
		}
		}
		}
        System.out.println("=======================");
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));*/
		//rows swapping
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));
		for(int i=0;i<numbers.length; i++) { 
		for(int j=0;j<numbers[i].length;j++) {
		if(i == numbers.length-1) {
		int temp = numbers[i][j];
        numbers[i][j] = numbers[0][j];
        numbers[0][j] = temp;
		}
		}
		}
        System.out.println("=======================");
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));

	}
}
