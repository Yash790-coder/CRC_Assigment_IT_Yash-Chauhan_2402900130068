import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            // Upper pyramid
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Lower inverted pyramid
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

