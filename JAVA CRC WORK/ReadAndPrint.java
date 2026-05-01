import java.util.Scanner;

public class ReadAndPrint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered integer: " + num);

            
            System.out.print("Enter a float: ");
            float f = sc.nextFloat();
            System.out.println("You entered float: " + f);

            
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            System.out.println("You entered character: " + ch);
        }
    }
}
