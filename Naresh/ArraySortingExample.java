import java.util.Arrays;

class ArraySortingExample 
{
	public static void main(String[] args) 
	{
		int[] numbers = {95,60,55,22,33,12,100};
		//sort the given array expected output -> {12,22,33,55,60,95,100}
		//{60,95,55,22,33,12,100}
		//{55,95,60,22,33,12,100}
        //{22,95,60,55,33,12,100}
		//{12,95,60,55,33,22,100}
		//{12,60,95,55,33,22,100}
        //{12,55,95,60,33,22,100}
        //{12,33,95,60,55,22,100}
        //{12,22,95,60,55,33,100}
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;i++) {//0<7
		for(int j=i+1;j<numbers.length;j++) {//1<7
		if(numbers[j]<numbers[i]) {
		int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
		}
		}
		}
		System.out.println(Arrays.toString(numbers));
		//task find the duplicate values in the given array
		//int[] taskArray = {1,2,1,3,5,3,9,6,7,6};
		//String[] stringTaskArray = {"Naresh", "Srilatha", "Shyamala", "Srinivas", "Naresh","Amulaya","Pavan", "Srinivas"};
	    //char[] charTaskArray = {'n','k','n','s','l','a','s'};
	}
}
