class ForLoopExample1ToFindPrimeNumber
{
public static void main (String[] args)
{
int num=17;
int divisionCount=0;
for (int i=1; i<=num; i++)
{
if(num%i==0)
{
divisionCount++;
}
}
if(divisionCount==2) System.out.println(num +"is prime");
else System.out.println(num +"is not prime");
}
}