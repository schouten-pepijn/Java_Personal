/* Simple mortgage calculator practice */
import java.util.Scanner;
import java.text.NumberFormat;

public class mortgage_calculator {
    public static void main(String[] args) {

        // Instanciate global variables
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the mortgage calculator!");

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEARS;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(numberOfPayments)











    }
}
