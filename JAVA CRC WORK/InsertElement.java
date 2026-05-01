import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n + 1]; // extra space for new element
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter element to insert: ");
            int element = sc.nextInt();

            System.out.print("Enter position (0 to " + n + "): ");
            int pos = sc.nextInt();

            // shift elements to the right
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }

            arr[pos] = element; // insert element

            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
