import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorRefactor {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // Welcome message
        System.out.println("Welcome to the mortgage calculator!");
        // Ask and store pricipal
        int principal = (int) readNumber(scanner, "Principal: ", 1000, 1000000);
        // Ask and store interest rate
        float annualInterest = (float) readNumber(scanner, "Annual Interest Rate: ", 1, 30);
        // Ask ad store period
        byte years = (byte) readNumber(scanner, "Period (Years): ", 1, 30);
        // Close scanner
        scanner.close();
        // Calculate the mortgage
        double mortgage = calculateMortgage(principal, annualInterest, years);
        // Format the mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(
        Scanner scanner,
         String prompt,
          double min,
           double max) {

        double value;
        while (true) {
            // Ask and store pricipal
            System.out.print(prompt);
            value = scanner.nextDouble();
            // error handling
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
        int principal,
         float annualInterest,
          byte years) {
        // Instanciate variables
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        // Calculate the mortgage
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }
}
