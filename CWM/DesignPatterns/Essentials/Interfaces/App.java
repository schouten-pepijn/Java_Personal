public class App {
    public static void main(String[] args) {
        // Loosely coupled
        TaxCalculatorable calculator = getTaxCalculator(0);
    }

    public static TaxCalculatorable getTaxCalculator(int year) {
        return new Calculator2019();
    }
}
