public class Main {
    public static void main(String[] args) throws Exception {
        // poor mans dependency injection via constructor
        var calculater = new TaxCalculator2018(50_000);
        var report = new TaxReport();
        report.show(calculater);

        // change the dependency via the method
        report.show(new TaxCalculator2019());
    }
}
