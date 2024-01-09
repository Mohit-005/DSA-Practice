import java.util.Scanner;

public class array_min_max {
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

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / size;

        // Display the result
        System.out.println("Average of elements in the array: " + average);

        // Close the scanner
        scanner.close();
    }
}
