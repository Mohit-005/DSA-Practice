import java.util.Scanner;

public class array_binary_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the element to be searched
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();

        // Perform binary search on the array to find the element
        int result = binarySearch(arr, 0, arr.length - 1, x);

        // Print the result of the binary search
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result);
        }
        scanner.close();
    }

    // Recursive method to perform binary search
    private static int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, high, x);
            }
        }
        return -1;
    }
}