import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            int ascii = (int) ch;  // type casting char to int
            System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        }
    }
}