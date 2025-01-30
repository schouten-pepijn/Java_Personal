import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++)
            System.out.print("Hello, World! ");

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.print("Hello, World! ");
            i++;
        }

        // more advanced while loop
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quit to exit");

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        // do while loop (excecute first)
        int j = 0;
        do {
            System.out.println("Hello, world!");
            j++;
        } while (j < 5);
        
    }
}