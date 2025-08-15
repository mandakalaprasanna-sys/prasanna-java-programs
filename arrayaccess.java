import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100]; // Max size
        int n;

        // Input size
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input index to access
        System.out.print("Enter index to access (0-based): ");
        int index = sc.nextInt();

        // Validate index and access element
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
        } else {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }

        sc.close();
    }
}