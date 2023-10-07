import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum < number) {
            System.out.println(number + " is a deficient number.");
        } else if (sum > number) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is a perfect number.");
        }
    }
}