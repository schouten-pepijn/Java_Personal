public class Main {
    public static void main(String[] args) {
        // Get user input
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        // Create calculator instance
        var calculator = new Calculate(principal, annualInterest, years);

        // create report instance
        var report = new Report(calculator);

        // Print report
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
