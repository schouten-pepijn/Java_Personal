public class TaxReport {

    // method injection
    public void show(TaxCalculator calculator) {
        // Dependency (tightly coupled)
        var tax = calculator.calculateTax();
        System.out.println("Tax: " + tax);
    }
}
