class PreAndPostIncrementExample
{
public static void main (String[] args)
{
int num= 20;
int sum = ++num + num++ + ++num + ++num + num++ + ++num;
System.out.println(sum);
}
}
