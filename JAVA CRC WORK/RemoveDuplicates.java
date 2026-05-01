import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Step 1: Input size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Step 2: Input array elements
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 3: Remove duplicates (simple method)
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;

                // Check if arr[i] appeared before
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                // Print only if not duplicate
                if (!isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}