import java.util.Scanner;
public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter income: $");
        double income = scanner.nextDouble();
        
        System.out.println("Please enter rent: $");
        double rent = scanner.nextDouble();

        System.out.println("Please enter utilities: $");
        double utilities = scanner.nextDouble();
        
        System.out.println("Please enter groceries: $");
        double groceries = scanner.nextDouble();
        

        double totalCost = rent - utilities - groceries;

        double rentPercentage = (rent / income) * 100;
        double utilitiesPercentage = (utilities / income) * 100;
        double groceriesPercentage = (groceries / income) * 100;
        double totalCostPercentage = (totalCost / income) * 100;

        System.out.println("Rent: $" + rent + " (" + rentPercentage + "%)");
        System.out.println("Utilities: $" + utilities + " (" + utilitiesPercentage + "%)");
        System.out.println("Groceries: $" + groceries + " (" + groceriesPercentage + "%)");
        System.out.println("Total Cost: $" + totalCost + " (" + totalCostPercentage + "%)");
        

        scanner.close();
    }
}
