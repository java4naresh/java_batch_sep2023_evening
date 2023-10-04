class FibinacciProgram 
{
	public static void main(String[] args) 
	{
	   int num = 9;
	   int fibinacci = 1;
       for(int i=1;i<=num;i++) {
         fibinacci = fibinacci*i;
       }
       System.out.println(fibinacci);
	}
}
