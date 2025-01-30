/* Simple mortgage calculator practice */
import java.util.Scanner;
import java.text.NumberFormat;

public class mortgage_calculator {
    public static void main(String[] args) {

        // Instanciate global variables and scanner object
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the mortgage calculator!");

        // Ask and store pricipal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Ask and store interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;

        // Ask ad store period
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEARS;

        // Close scanner
        scanner.close();

        // Calculate the mortgage
        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        // Format the mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);











    }
}
