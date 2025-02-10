import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalcErrorHandling {
    public static void main(String[] args) {

        // Instanciate global variables and scanner object
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the mortgage calculator!");

        
        int principal;
        while (true) {
            // Ask and store pricipal
            System.out.print("Principal: ");
            principal = scanner.nextInt();

            // error handling
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Principal must be between $1,000 and $1,000,000");
        } 


        float annualInterest;
        float monthlyInterest;
        while (true) {
            // Ask and store interest rate
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            
            // error handling
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;
                break;
            }
            System.out.println("Interest rate must be between 1% and 30%");
        }


        byte years;
        int numberOfPayments;
        while (true) {
        // Ask ad store period
        System.out.print("Period (Years): ");
        years = scanner.nextByte();
        numberOfPayments = years * MONTHS_IN_YEARS;

        // error handling
        if (years >= 1 && years <= 30)
            break;
        System.out.println("Period must be between 1 year and 30 years");
        }

        
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
