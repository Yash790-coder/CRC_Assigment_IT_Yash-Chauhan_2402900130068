import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
         if (number < 2) {
            return false;
        }
         for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

