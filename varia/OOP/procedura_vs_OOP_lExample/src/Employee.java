    // encapsulation
public class Employee {
    // instance fields
    private int baseSalary;
    private int hourlyRate;

    // static field
    public static int numberOfEmployees = 0;

    // Constructor method
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setEmployeeCount();
    }
    // Constructor overloading
    public Employee(int baseSalary) {
        this(baseSalary, 0);
        setEmployeeCount();
    }

    // calculate the wage of the employee
    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
    // Method overloading for no extra hours
    public int calculateWage() {
        return calculateWage(0);
    }

    // create setter methods
    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative.");
        this.baseSalary = baseSalary;
    }
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        this.hourlyRate = hourlyRate;
    }

    // create getter methods
    public int getBaseSalary() {
        return baseSalary;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }

    // for setting the static field
    private static void setEmployeeCount() {
        numberOfEmployees++;
    }

    // for printing the static field
    public static void printEmployeeCount() {
        System.out.println("Number of employees: " + numberOfEmployees);
    }
}
