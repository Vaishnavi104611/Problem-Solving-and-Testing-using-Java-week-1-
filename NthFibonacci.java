import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Nth Fibonacci = 0");
            return;
        }
        if (n == 1) {
            System.out.println("Nth Fibonacci = 1");
            return;
        }

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Nth Fibonacci = " + c);
    }
}
