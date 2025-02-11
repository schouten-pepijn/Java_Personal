package templatePattern;

public class App {
    public static void main(String[] args) {
        var task = new TransferMoneyTask(new AuditTrail());
        task.execute();

        var task2 = new GenerateReportTask();
        task2.execute();
    }
}
