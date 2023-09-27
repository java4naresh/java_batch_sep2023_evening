class IfElseLadderAssignment
{
public static void main(String[] args)
{
int num1=10;
int num2=12;
if(num1%2==0 && num2%2==0)
{
System.out.println(num1);
}
else if(num1%2==1 && num2%2==1)
{
System.out.println(num2);
}
else
{
System.out.println("Invalid");
}
}
}