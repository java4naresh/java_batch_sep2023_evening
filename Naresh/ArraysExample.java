import java.util.Arrays;

class ArraysExample 
{
	public static void main(String[] args) 
	{
		int[] numbers = {10,20,30,40,50}; 
        /*System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50*/

		// to print the all values by using for llop
		/*for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
		}*/

		//updating the values
        numbers[0] = 15;
		numbers[2] = 35;

		/*System.out.println(numbers[0]);//15
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//35
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50*/
        //numbers[5] = 60; error not possible to increase the size of the array
		//System.out.println(numbers.length);
		/*for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
		}*/
		/*int numCheck = 60;
		boolean flag = false;
        for(int i=0;i<numbers.length;i++) {
		    if(numCheck == numbers[i]) {
			  flag = true;
			}
		}
		System.out.println(Arrays.toString(numbers));
		if(flag) System.out.println("Present");
		else System.out.println("Not Present");*/
        
		//[95,60,55,22,33,12,100] -> min and max task
		// doubt clarify
		/*int num = 20;
		System.out.println(num);
		num = 25;
        System.out.println(num);*/

		int sumArray[] = {5,9,6,3,8,9};
		int sum = 0;
        for(int i=sumArray.length-1;0<=i;i--) {
        sum = sum + sumArray[i];
        }
        System.out.println(sum);
	}
}
