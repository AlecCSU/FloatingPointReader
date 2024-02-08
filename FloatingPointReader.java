import java.util.Scanner;

public class FloatingPointReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to hold the sum, maximum, minimum, and count of numbers entered
        double sum = 0.0;
        double max = Double.MIN_VALUE; // Start with the smallest possible double value
        double min = Double.MAX_VALUE; // Start with the largest possible double value
        int count = 0;

        // Loop to read five floating-point values
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                sum += value; // Add value to sum
                if (value > max) {
                    max = value; // Update maximum if current value is greater
                }
                if (value < min) {
                    min = value; // Update minimum if current value is lesser
                }
                count++; // Increment count after a successful read
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Calculating average and interest
        double average = sum / count;
        double interest = sum * 0.20; // 20% interest on total

        // Printing the results
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close(); // Close the scanner
    }
}
