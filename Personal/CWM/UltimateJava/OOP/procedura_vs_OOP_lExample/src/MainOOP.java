public class MainOOP {
    public static void main(String[] args) {

        // print the number of employees
        System.out.println(Employee.numberOfEmployees);

        // create an object with initial values
        var employee = new Employee(
            50_000, 20);

        // print the number of employees
        Employee.printEmployeeCount();

        // store the wage
        int wage = employee.calculateWage(10);

        // print the wage
        System.out.println(wage);

    }
}
