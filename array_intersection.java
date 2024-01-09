import java.util.Arrays;
import java.util.Scanner;

public class array_intersection {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the first array: ");
            int size1 = scanner.nextInt();
            int[] arr1 = new int[size1];

            System.out.println("Enter elements of the first array:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = scanner.nextInt();
            }

            System.out.print("Enter the size of the second array: ");
            int size2 = scanner.nextInt();
            int[] arr2 = new int[size2];

            System.out.println("Enter elements of the second array:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = scanner.nextInt();
            }

            int[] intersection = findIntersection(arr1, arr2);

            System.out.println("Intersection of the two arrays:");
            for (int element : intersection) {
                System.out.print(element + " ");
            }
        }
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection[index++] = arr1[i];
                    break; // Move to the next element in arr1 to avoid duplicates
                }
            }
        }

        // Trim the array to the actual size of the intersection
        return Arrays.copyOf(intersection, index);
    }
}
