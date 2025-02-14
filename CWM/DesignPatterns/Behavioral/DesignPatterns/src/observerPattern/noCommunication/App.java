package observerPattern.noCommunication;

public class App {
    public static void main(String[] args) {
        var DataSource = new DataSource();

        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();

        var chart = new Chart();

        DataSource.addObserver(sheet1);
        DataSource.addObserver(sheet2);
        DataSource.addObserver(chart);

        DataSource.setValue(1);
    }
}
