import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for input
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        scanner.nextLine();  // consume the enter key

        // Print the user's name
        System.out.println("Hello, " + name + "!");

        // Print the user's age
        System.out.println("You are " + age + " years old.");
    
        // Close the scanner
        scanner.close();
    }
}
