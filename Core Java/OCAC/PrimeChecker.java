import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true; // Assume the number is prime

        // A prime number is greater than 1 and divisible only by 1 and itself
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // If number is divisible by any i, it's not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
