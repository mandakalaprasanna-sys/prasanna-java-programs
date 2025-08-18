public class LinearSearchExample {
    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    // Main method to test the linear search
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 9, 4}; // Unsorted array
        int target = 9;

        int result = linearSearch(numbers, target);

        if (result == -1) {
