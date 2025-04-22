import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // Check divisibility from 2 to num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;  // No need to check further if it's divisible
            }
        }

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}
