public class Main {
    public static void main(String[] args) throws Exception {
        // poor mans dependency injection via constructor
        var calculater = new TaxCalculator2018(50_000);
        var report = new TaxReport(calculater);

        report.show();

        // change the dependency
        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}
