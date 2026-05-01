import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result = " + (num1 + num2));
                case 2 -> System.out.println("Result = " + (num1 - num2));
                case 3 -> System.out.println("Result = " + (num1 * num2));
                case 4 -> {
                    if (num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

