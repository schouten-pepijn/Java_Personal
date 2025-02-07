import java.util.Scanner;

public class NewMethods {
    // main method
    public static void main(String[] args) {
        // create a scanner
        Scanner scanner = new Scanner(System.in);
        // prompt the user
        System.out.print("Enter your first name: ");
        // get the name
        String firstName = scanner.nextLine();
        // prompt the user
        System.out.print("Enter your last name: ");
        // get the name
        String lastName = scanner.nextLine();

        // call the greet
        String message = greetUser(firstName, lastName);

        System.out.println(message);
    }

    // create a new method to greet
    public static String greetUser(String firstName, String lastName) {
        String message = "Hello " + firstName + " " + lastName;
        
        System.out.println(message);

        return message;
    }
}