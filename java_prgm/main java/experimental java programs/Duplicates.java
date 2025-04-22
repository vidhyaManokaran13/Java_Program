import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size and input elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Duplicate values in the array:");

        // Find and print duplicates
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Exit inner loop after finding the duplicate
                }
            }
        }

        scanner.close();
    }
}
