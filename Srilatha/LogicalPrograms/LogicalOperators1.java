class LogicalOperators1{
public static void main(String args[]){
int num1=10;
int num2=4;
boolean finalResult1 =(num1%2==0 && num2%2==0);//true
System.out.println(finalResult1);

int num3=7;
int num4=15;
boolean finalResult2=(num3%2==0 ||num4%2==0);
System.out.println(finalResult2);

int num5=10;
int num6=20;
boolean finalResult3=!(num5>5 && num6>5);
System.out.println(finalResult3);

}
}