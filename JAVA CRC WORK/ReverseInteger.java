import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            int reversed = 0;

            while (num != 0) {
                int temp = num % 10;          // extract last digit
                reversed = reversed * 10 + temp; // build reversed number
                num = num / 10;                // remove last digit
            }

            System.out.println("Reversed number = " + reversed);
        }
    }
}
