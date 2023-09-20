class PreAndPostIncrementExample
{
public static void main(String[] args)
{
int num=42;
num++;
System.out.println(num);//43
num++;
System.out.println(num);//44
num++;
System.out.println(num);//45
num++;
System.out.println(num);//46
num++;
System.out.println(num);//47
int sum = ++num + ++num + num++ + num++ + num++ +num++;
System.out.println(sum);
}
}