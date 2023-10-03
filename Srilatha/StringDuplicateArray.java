import java.util.*;
	class StringDuplicateArray{
	public static void main(String args[]){
	String[] arr={"Naresh","Srilatha","Syamala","Srinivas","Naresh","Amulya","Pavan","Srinivas"};
	for(int i=0;i<=arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
	if(arr[i].equals(arr[j])){
	System.out.println(arr[j]);
     }
   }
 }
}
}
