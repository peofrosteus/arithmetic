import java.util.Scanner; // Importing the Scanner class from java.util package, to take input from the user

public class Arithmetic {

    // Take two numbers and return their sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // Take two numbers and return their difference
    public static int difference(int a, int b) {
        return a - b;
    }

    // Take two doubles and return their average
    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input

        // Output empty line
        System.out.println();

        // Taking two integers as input from the user
        System.out.print("First number: ");
        int num1 = scanner.nextInt();

        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        // Calling the sum method and displaying the result
        int sumResult = sum(num1, num2);
        System.out.println("The sum is: " + sumResult);

        // Calling the difference method and displaying the result
        int diffResult = difference(num1, num2);
        System.out.println("The difference is: " + diffResult);

        // Taking two decimal numbers as input from the user for average calculation
        System.out.print("The first decimal number: ");
        double double1 = scanner.nextDouble();

        System.out.print("The second decimal number: ");
        double double2 = scanner.nextDouble();

        // Calling the average method and displaying the result
        double avgResult = average(double1, double2);
        System.out.println("The average is: " + avgResult);

        scanner.close(); // Closing the scanner object
    }
}
