class PreAndPostDecrementExample
{
public static void main(String[] args)
{
int num=42;
num--;
System.out.println(num);//41
num--;
System.out.println(num);//40
num--;
System.out.println(num);//39
num--;
System.out.println(num);//38
num--;
System.out.println(num);//37
int sum= --num + num-- +num-- + --num;//36+35+35+34
System.out.println(sum);
}
}