import java.lang.*;
import java.util.Arrays;

class MaximumArray{
public static void main(String args[]){

	int[] array={95,60,55,22,33,12,100};
	int max=array[0];

	for(int i=1;i<array.length;i++){
	if(array[i]>max){
	max=array[i]; 
	}
	}
	System.out.println("The maximum number of the array is " +max);
}
}