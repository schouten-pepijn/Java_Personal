package templatePattern;

public class TransferMoneyTask extends Task {


    // Do not use default constructor
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    // Override the abstract method from superclass
    @Override
    protected void doExecute() {
        System.out.println("Transferring money");
    }
}
