import java.util.Scanner;

public class array_rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Input elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the number of positions to rotate from the user
        System.out.print("Enter the number of positions to rotate (positive for right, negative for left): ");
        int positionsToRotate = scanner.nextInt();

        // Rotate the array elements
        rotateArray(array, positionsToRotate);

        // Display the rotated array
        System.out.println("Rotated array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to rotate the array elements
    private static void rotateArray(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n; // Adjust for rotations more than array length

        if (positions < 0) {
            positions = n + positions; // Convert negative rotations to positive
        }

        int[] temp = new int[positions];

        // Copy the first 'positions' elements to a temporary array
        for (int i = 0; i < positions; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = 0; i < n - positions; i++) {
            arr[i] = arr[i + positions];
        }

        // Copy the elements from the temporary array to the end
        for (int i = n - positions, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
}
