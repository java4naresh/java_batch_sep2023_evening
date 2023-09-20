class PreAndPostIncrementExample1
{
public static void main (String[] args)
{
int num= 20;
//++num;
//System.out.println(++num);
int sum = ++num + num++ + ++num + ++num + num++ + ++num;//21+21+23+24+24+26
System.out.println(sum);
}
}
