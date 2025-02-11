package templatePattern.problem;

public class TransferMoneyTask {

    private AuditTrail auditTrail;

    // Code Duplication
    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    // Code Duplication
    public void execute() {
        auditTrail.record();

        // transfer money
        System.out.println("Transferring money");
    }
}
