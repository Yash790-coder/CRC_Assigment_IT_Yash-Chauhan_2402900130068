import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                // print spaces
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                // print stars
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println(); // move to next line
            }
        }
    }
}

