package observerPattern.pullStyleCommunication;

public class SpreadSheet implements Observer {
    // Loose coupling on datasource class
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void update() {
        // Pulls the value from the datasource directly
        System.out.println("Spreadsheet updated " + dataSource.getValue());
    }
}
