package varia.scripts;
import java.util.Scanner;
import java.util.ArrayList;

// Class to manage a to-do list
public class toDoListManager {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList to store tasks
        ArrayList<String> toDolist = new ArrayList<>();
        // Display the menu
        showMenu(toDolist, scanner);   
    }
        

    // Method to display the menu
    public static void showMenu(ArrayList<String> todoList, Scanner scanner) {
        int choice;
        do {
            // Display the menu
            System.out.println("Select an option:");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1, 2, 3, 4): ");
            // Get the user's choice
            choice = scanner.nextInt();
            scanner.nextLine();
            // Perform the selected action
            handleChoice(choice, todoList, scanner);
        } while (choice != 4);
    }

    // Method to handle the user's choice
    public static void handleChoice(int userChoice, ArrayList<String> toDoList, Scanner input) {
        switch (userChoice) {
            case 1:
                addTask(toDoList, input);
                break;
            case 2:
                viewTasks(toDoList);
                break;
            case 3:
                removeTask(toDoList, input);
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
        
    // Method to add a task to the to-do list
    public static void addTask(ArrayList<String> todoList, Scanner scanner) {
        System.out.print("Enter the task: ");
        String newTask = scanner.nextLine().trim();
        todoList.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    // Method to view tasks in the to-do list
    public static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, tasks.get(i));
            }
        }
    }


    // Method to remove a task
    public static void removeTask(ArrayList<String> toDoList, Scanner scanner) {
        // Check if the list is empty
        if (toDoList.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            // Get the task number to remove
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();
            // Check if the task number is valid
            if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                String removedTask = toDoList.remove(taskNumber - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                // Invalid task number
                System.out.println("Invalid task number");
            }
        }
    }
}
    
