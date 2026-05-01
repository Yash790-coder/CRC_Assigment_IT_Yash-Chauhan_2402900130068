 import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        for (int num = 1; num <= N; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isArmstrong(int number) {
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }
} 





    


