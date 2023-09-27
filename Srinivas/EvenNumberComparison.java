class EvenNumberComparison {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            // Both numbers are even, so print the lesser number
            if (num1 < num2) {
                System.out.println("The lesser even number is: " + num1);
            } else {
                System.out.println("The lesser even number is: " + num2);
            }
        } else {
            // At least one number is not even, so print the greater number
            if (num1 > num2) {
                System.out.println("The greater number is: " + num1);
            } else {
                System.out.println("The greater number is: " + num2);
            }
        }
    }
}

