import java.lang.*;
import java.util.Arrays;

class MinimumArray{
public static void main(String args[]){

	int[] array={95,60,55,22,33,12,100};
	int min=array[0];

	for(int i=1;i<array.length;i++){
	if(array[i]<min){
	min=array[i]; 
	}
	}
	System.out.println("The minimum number of the array is " +min);
}
}