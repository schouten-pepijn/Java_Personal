public class Calculate {
    // Constants
    private final static byte PERCENT = 100;
    private final static byte MONTHS_IN_YEAR = 12;

    // Fields
    private int principal;
    private float annualInterest;
    private byte years;

    // Constructor
    public Calculate(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    // Calculate balance method
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
    
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                 - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return balance;
    }

    // Calculate mortgage method
    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
    
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }

    // Get remaining balances
    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    // Get number of payments
    private int getNumberOfPayments() {
        return years * Calculate.MONTHS_IN_YEAR;
    }

    // Get monthly interest
    private float getMonthlyInterest() {
        return annualInterest / Calculate.PERCENT / Calculate.MONTHS_IN_YEAR;
    }

}
