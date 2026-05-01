import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int sum = 0;

            while (num != 0) {
                int digit = num % 10;   // extract last digit
                sum += digit;          // add to sum
                num = num / 10;        // remove last digit
            }

            System.out.println("Sum of digits = " + sum);
        }
    }
}

