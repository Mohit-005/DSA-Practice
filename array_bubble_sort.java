import java.util.Scanner;

public class array_bubble_sort {
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

        // Sort the array using bubble sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform bubble sort on the array
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1] if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
