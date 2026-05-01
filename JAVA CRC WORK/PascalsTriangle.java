import java.util.Scanner;

public class PascalsTriangle {
    // method to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // method to calculate binomial coefficient
    static int binomialCoeff(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            for (int i = 0; i < rows; i++) {
                // print spaces for alignment
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                // print values
                for (int k = 0; k <= i; k++) {
                    System.out.print(binomialCoeff(i, k) + " ");
                }
                System.out.println();
            }
        }
    }
}
