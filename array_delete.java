import java.util.Scanner;

public class array_delete {
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

        // Get the position to delete the element from
        System.out.print("Enter the position to delete the element from (1 to " + size + "): ");
        int position = scanner.nextInt();

        // Check if the position is valid
        if (position < 1 || position > size) {
            System.out.println("Invalid position. Deletion failed.");
        } else {
            // Shift elements to remove the specified element
            for (int i = position - 1; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            // Display the updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < size - 1; i++) {
                System.out.println("Element " + (i + 1) + ": " + array[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
