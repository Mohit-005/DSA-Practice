import java.util.Scanner;

public class array_search {
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

        // Get the element to search for from the user
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
