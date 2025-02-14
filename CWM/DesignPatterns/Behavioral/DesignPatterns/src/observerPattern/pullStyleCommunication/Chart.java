package observerPattern.pullStyleCommunication;

public class Chart implements Observer {
    // Loosely coupled with DataSource
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        // Pulls the value from the datasource directly
        System.out.println("Chart updated " + dataSource.getValue());
    }
}
