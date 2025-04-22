import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0, originalNum = num;

        // Loop through each digit
        while (num > 0) {
            int digit = num % 10;   // Get the last digit
            sum += digit * digit * digit;  // Cube the digit and add to sum
            num /= 10;  // Remove the last digit
        }

        // Check if sum is equal to original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
