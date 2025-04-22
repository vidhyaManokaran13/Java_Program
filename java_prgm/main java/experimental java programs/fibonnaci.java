import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	  int a=0;
	  int b=1;
	  int c;
        
        System.out.print("Enter a range: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
	  }
	}
}