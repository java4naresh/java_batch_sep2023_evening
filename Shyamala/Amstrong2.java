class Amstrong2{
public static void main(String[] args){
 for(int i=1;i<1001;i++){
  int num = i;
  int backup = num;
  int sum = 0;
    while(num!=0){
    int rem = num%10;
    num = num/10;
    sum = sum+(rem*rem*rem);
 }
   if(sum==backup) System.out.println("amstrong number is "+backup);
}
}
}