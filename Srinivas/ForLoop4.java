class ForLoop4

{
public static void main(String[] args)
{
int num = 7;
boolean flag = true;
for(int i=2; i<num; i++)
{
if(num%i==0)
{
flag = false;
}
}
if(flag)System.out.println("Prime");
else(flag)System.out.println("Not Prime");
}
}