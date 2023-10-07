class SumOfFibnocci{
public static void main(String args[]){
int sum=0;
for(int i=1;i<=20;i++){
int fibnocci=1;

for(int j=1;j<=i;j++){
fibnocci= fibnocci*j;
}
sum=fibnocci;
}
System.out.println("The sum of fibnocci numbers from 1 to 20 is" +sum);
}
}
