npcimport java.util.Scanner;

public class Calculator {
    private CalculatorOperations operations;

    public Calculator() {
        operations = new CalculatorOperations();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator App!");

        while (true) {
            System.out.println("Choose an operation: 1) Add 2) Subtract 3) Exit");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + operations.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + operations.subtract(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}