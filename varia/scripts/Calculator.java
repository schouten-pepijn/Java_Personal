package varia.scripts;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user for an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Calculate the result
        double result = calculate(num1, num2, operator);

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }


    // Performs a basic arithmetic operation on two numbers.
    public static double calculate(double num1, double num2, char operator) {
        double result;

        // Perform the calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                // Invalid operator
                System.out.println("Error: Invalid operator");
                return Double.NaN;
        }
        return result;
    }
}
