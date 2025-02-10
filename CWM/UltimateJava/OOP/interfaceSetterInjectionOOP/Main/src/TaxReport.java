public class TaxReport {
    // Interface
    private TaxCalculator calculator;

    // Constructor injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    // Setter injection (change dependency at runtime)
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        // Dependency (tightly coupled)
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }
}
