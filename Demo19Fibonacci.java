import java.util.Scanner;

public class Demo19Fibonacci {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Check if the number of terms is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Print the Fibonacci series
            System.out.println("Fibonacci Series up to " + n + " terms:");

            // Variables to store the first two terms
            long first = 0, second = 1;

            // Special case for 1 term
            if (n == 1) {
                System.out.println(first);
            } else {
                // Print the first two terms
                System.out.print(first + " " + second);
                // Loop to generate the next terms in the Fibonacci series
                for (int i = 3; i <= n; i++) {
                    long next = first + second;
                    System.out.print(" " + next);

                    // Update first and second for the next iteration
                    first = second;
                    second = next;
                }
            }
        }

        // Close the scanner
        scanner.close();
}
}
