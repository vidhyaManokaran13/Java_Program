public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            account.withdraw(700);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.withdraw(500);
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            account.withdraw(300);
        }, "Thread-3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}