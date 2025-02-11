package templatePattern.problem;

public class GenerateReportTask {

    private AuditTrail auditTrail;

    // Code duplication
    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    // Code duplication
    public void execute() {
        auditTrail.record();

        // Generate report
        System.out.println("Generating report");
    }
}
