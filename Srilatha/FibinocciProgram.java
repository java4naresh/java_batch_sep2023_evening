class FibinocciProgram 
{
	public static void main(String[] args) 
	{
	   int num = 20;
	   long fibinocci = 1;
	   long sum=0;
	
       	for(int i=1;i<=num;i++) {
         fibinocci = fibinocci*i;
	sum=fibinocci;
       }
       System.out.println("The sum of fibnocci numbers from 1 to 20 is" +sum);
	}
}