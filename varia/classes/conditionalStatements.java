public class ConditionalStatements {
    public static void main(String[] args) {

        int income = 120_000;
        boolean hasHighIncome;

        // amature way
        if (income > 100_000) {
            hasHighIncome = true;
        }
        else {
            hasHighIncome = false;
        }
        System.out.println(hasHighIncome);

        // modern way
        if (income > 100_000) hasHighIncome = true;
        else hasHighIncome = false;
        System.out.println(hasHighIncome);

        // even shorter
        hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        // terinary operator ? if : else
        String result = (income > 100_000) ? "High Income" : "Low Income";
        System.out.println(result);
    
        // switch statement
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Admin User");
                break;
            case "moderator":
                System.out.println("Moderator User");
                break;
            default:
                System.out.println("Unknown User");
        }   
    }
}
