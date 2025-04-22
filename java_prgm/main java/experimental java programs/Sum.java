import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask user to input how many numbers
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize variables to store the sum and average
        int sum = 0;
        
        // Loop to take input for N numbers and calculate the sum
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            sum += number;  // Add the entered number to sum
        }
        
        // Calculate the average
        double average = (double) sum / n;
        
        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
