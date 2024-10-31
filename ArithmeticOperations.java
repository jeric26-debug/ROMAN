import java.util.Scanner;

public class ArithmeticOperations {

    // Method for addition
    public static double add(double x, double y) {
        return x + y;
    }

    // Method for subtraction
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Method for multiplication
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method for division
    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return 'Not a Number' if division by zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        // Print results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        scanner.close();
    }
}