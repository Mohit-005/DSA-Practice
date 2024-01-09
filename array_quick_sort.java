import java.util.Scanner;

public class array_quick_sort {
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

        // Sort the array using quicksort
        quickSort(array, 0, size - 1);

        // Display the sorted array
        System.out.println("Sorted array (using QuickSort):");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform quicksort on the array
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
