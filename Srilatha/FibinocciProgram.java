class FibinocciProgram 
{
	public static void main(String[] args) 
	{
	   int num = 9;
	   int fibinocci = 1;
       for(int i=1;i<=num;i++) {
         fibinocci = fibinocci*i;
       }
       System.out.println(fibinocci);
	}
}