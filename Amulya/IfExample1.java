class IfExample1
{
public static void main(String[] args)
{
int age =23;
char gender='M';
if((gender=='M' && age>=21) || (gender=='F' && age>=18))
{
System.out.println("Allowed for marriage");
}
}
}