import java.util.Scanner;

public class array_insert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size + 1]; // Increase size to accommodate the new element

        // Input elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the element to insert from the user
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        // Get the position to insert the element at from the user
        System.out.print("Enter the position to insert the element at (1 to " + (size + 1) + "): ");
        int position = scanner.nextInt();

        // Check if the position is valid
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position. Insertion failed.");
        } else {
            // Shift elements to make space for the new element
            for (int i = size; i >= position; i--) {
                array[i] = array[i - 1];
            }

            // Insert the new element at the specified position
            array[position - 1] = elementToInsert;

            // Display the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i < size + 1; i++) {
                System.out.println("Element " + (i + 1) + ": " + array[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
