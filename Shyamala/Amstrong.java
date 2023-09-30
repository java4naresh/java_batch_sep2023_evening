class Amstrong{
public static void main(String[] args){
  int num = 153;
  int backup = num;
  int sum = 0;
    while(num!=0){
    int rem = num%10;
    num = num/10;
    sum = sum+(rem*rem*rem);
 }
   if(sum==backup)System.out.println("Amstrong");
   else System.out.println("Not Amstrong");
}
}

 
  
