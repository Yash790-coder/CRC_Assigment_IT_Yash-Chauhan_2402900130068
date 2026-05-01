import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

       
        for (int num = 1; num <= N; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int original = number;   
        int reversed = 0;        

        while (number > 0) {
            int digit = number % 10;         
            reversed = reversed * 10 + digit; 
            number = number / 10;            
        }

        return original == reversed;
    }
}

