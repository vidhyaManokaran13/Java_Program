import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Initialize factorial variable to 1
        long factorial = 1;
        
        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("Factorial of " + num + " is " + factorial);
        
        // Close the scanner
        scanner.close();
    }
}
