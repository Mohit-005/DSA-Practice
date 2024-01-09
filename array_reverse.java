import java.util.Scanner;

public class array_reverse {
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

        // Reverse the array elements
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Display the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
