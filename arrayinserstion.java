import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; // Maximum size
        int n; // Current size

        // Read number of elements
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the element and position to insert
        System.out.print("Enter element to insert: ");
        int elem = sc.nextInt();

        System.out.print("Enter position (0-based index): ");
        int pos = sc.nextInt();

        // Check if position is valid
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the right
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert the element
            arr[pos] = elem;
            n++;

            // Display the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
