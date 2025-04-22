import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size + 1];  // Array size is increased by 1 to make room for the new element

        // Fill the array with elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask for the element and position to insert
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position (0 to " + size + "): ");
        int position = scanner.nextInt();

        // Insert the element at the specified position
        if (position >= 0 && position <= size) {
            for (int i = size - 1; i >= position; i--) {
                arr[i + 1] = arr[i];  // Shift elements to the right
            }
            arr[position] = element;  // Insert the new element at the specified position
        } else {
            System.out.println("Invalid position.");
        }

        // Print the updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
