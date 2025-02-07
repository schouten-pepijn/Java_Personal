import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorSchedule {

    // Instanciate variables
    final static byte MONTHS_IN_YEARS = 12;
    final static byte PERCENT = 100;

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
        
        System.out.println("MORTGAGE: " + mortgageFormatted);

        System.out.println("BALANCE:");

        extracted(principal, annualInterest, years);
    }

    private static void extracted(int principal, float annualInterest, byte years) {
        for (short month = 1; month <= years * MONTHS_IN_YEARS; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
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

    public static double calculateBalance(
        int principal,
         float annualInterest,
          byte years,
           short numberOfPaymentsMade
    ) {

        // Calculate the mortgage
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);

        // Calculate the balance
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        return balance;

    }

    public static double calculateMortgage(
        int principal,
         float annualInterest,
          byte years
    ) {
        // Calculate the mortgage
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;
        short numberOfPayments = (short) (years * MONTHS_IN_YEARS);
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }
}
