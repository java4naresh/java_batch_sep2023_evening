class ForLoop5

{
public static void main(String[] args)
{
int num = 11;
boolean flag = true;
for(int i=2; i<num; i++)
{
if(num%i==0)
{
flag = false;
}
}
if(flag)System.out.println(num+" is Prime");
else(flag)System.out.println(num+" is Not Prime");
}
}