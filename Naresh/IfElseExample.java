class IfElseExample 
{
	public static void main(String[] args) 
	{
		int age = 17;

		if(age < 18) {
          System.out.println("Minor");
		} else {
          System.out.println("Major");
		}

		//
        int num = 12;
		if(num%2==0) {
		System.out.println("Given Number is Even!");
		} else {
           System.out.println("Given Number is Odd!");
		}

		int num2 = 0;
		if(num2 == 0) {
		System.out.println("Given Number is Zero!");
		} else {
			System.out.println("Given Number is not Zero!");
		}

		int num3 = -5;
		if(num3 < 0) {
		System.out.println("Given Number is Negitive!");
		} else {
			System.out.println("Given Number is Positive!");
		}

		age = 20;
		char gender = 'M';
        
		if(gender == 'M' && age >= 21 || gender == 'F' && age >= 18) {//false || true
		System.out.println("Allowed for Marraige");
		} else {
			System.out.println("Not allowed for Marraige");
		}

		int ch = 'b';//'a','e','i','o','u'
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given character is vowel");
		} else {
			System.out.println("Given character is consonant");
		}
	}
}
