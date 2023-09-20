class IfExample 
{
	public static void main(String[] args) 
	{
		/*if(true) {
		
		System.out.println("Hello World!");
		
		}*/
		int num = 11;
		if(num%2==0) {
		System.out.println("Given Number is Even!");
		}

		int num2 = 1;
		if(num2 == 0) {
		System.out.println("Given Number is Zero!");
		}

		int num3 = 5;
		if(num3 < 0) {
		System.out.println("Given Number is Negitive!");
		}

		int age = 28;
		char gender = 'F';
        
		if((gender == 'M' && age >= 21) || (gender == 'F' && age >= 18)) {//false || true
		System.out.println("Allowed for Marraige");
		}

		int num4 = 9;
		int num5 = 20;

		/*if(++num4 == 10 && ++num5 == 20) {//10 == 10 && 21 == 20
		
		System.out.println("Both are Satisfied");
		}*/

        if(++num4 == 11 || ++num5 == 20) {//10 == 11 || 21 == 20
		
		System.out.println("Both are Satisfied");
		}

		System.out.println(num4);//10
        System.out.println(num5);//21

	}
}
