class SumOfFibnocci{
public static void main(String args[]){

for(int num=1;num<=20;num++){
int fibnocci=1;

for(int i=1;i<=num;i++){
fibnocci=fibnocci*i;
}
System.out.println(fibnocci);
}
}
}