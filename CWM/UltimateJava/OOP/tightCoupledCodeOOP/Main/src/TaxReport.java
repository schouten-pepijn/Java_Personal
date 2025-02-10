public class TaxReport {
    // Dependency (tightly coupled)
    private TaxCalculator2018 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2018(50_000);
    }

    public void show() {
        // Dependency (tightly coupled)
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }
}
