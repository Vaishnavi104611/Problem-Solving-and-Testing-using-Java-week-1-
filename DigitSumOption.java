import java.util.Scanner;

public class DigitSumOption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter option (1 for EVEN sum, 2 for ODD sum): ");
        int opt = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            n = n / 10;
        }

        if (opt == 1) {
            System.out.println("Sum of EVEN digits = " + evenSum);
        } else if (opt == 2) {
            System.out.println("Sum of ODD digits = " + oddSum);
        } else {
            System.out.println("Invalid option");
        }
    }
}
