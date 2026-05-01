import java.util.Scanner;

public class PrimeNumbers2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();

            System.out.println("Prime numbers between 1 and " + N + " are:");

            for (int num = 2; num <= N; num++) {
                boolean isPrime = true;

               
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}

