class ForLoopExampleToFindPrimeNumber
{
public static void main (String[] args)
{
int num=10;
boolean flag=true;
for (int i=2; i<num; i++)
{
if(num%i==0)
{
flag=false;
}
}
if(flag) System.out.println(num +"is prime");
else System.out.println(num +"is not prime");
}
}