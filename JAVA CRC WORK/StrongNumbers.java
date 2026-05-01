import java.util.Scanner;

public class StrongNumbers {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;       
            sum = sum + factorial(digit); 
            temp = temp / 10;            
        }

        return sum == number; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        
        for (int i = 1; i <= N; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }

        
    }
}