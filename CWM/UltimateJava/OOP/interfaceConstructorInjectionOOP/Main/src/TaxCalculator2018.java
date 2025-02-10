public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // implementation of the abstract method in interface
    @Override public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
