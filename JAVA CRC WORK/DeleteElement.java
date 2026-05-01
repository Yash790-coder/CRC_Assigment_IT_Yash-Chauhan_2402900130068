import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter position to delete (0 to " + (n - 1) + "): ");
            int pos = sc.nextInt();

            // shift elements to the left
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
