import java.util.Scanner;

public class array_initialization {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The values of the array are: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}