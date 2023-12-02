import java.util.Scanner;

public class Get2 Factorial {

    // Method to calculate and return factorial of a number
    public static long calculateFactorial(int x) {
        if (x < 0) {
            System.out.println("Not valid input: " + x);
            return -1; // Indicate error with -1
        }

        long factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input for n and m
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value for m: ");
        int m = scanner.nextInt();

        // Check if either input is negative
        if (n < 0 || m < 0) {
            System.out.println("Not valid input: " + n + " " + m);
            return;
        }

        // Print factorials for numbers from n to m
        for (int i = n; i <= m; i++) {
            long factorial = calculateFactorial(i);

            if (factorial != -1) {
                System.out.println("Factorial of " + i + ": " + factorial);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
