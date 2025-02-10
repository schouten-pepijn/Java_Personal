import java.text.NumberFormat;

public class Report {

    // Instance variables
    private Calculate calculator;
    private NumberFormat currency;

    // Constructor
    public Report(Calculate calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    // Print methods
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }
}
