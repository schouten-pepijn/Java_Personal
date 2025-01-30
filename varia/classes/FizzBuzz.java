import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // check if number is divisible by 3 and 5
        // most specific first
        boolean divByThree = number % 3 == 0;
        boolean divByFive = number % 5 == 0; 
        if (divByThree && divByFive)
            System.out.println("FizzBuzz");
        else if (divByThree)
            System.out.println("Fizz");
        else if (divByFive)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // close scanner
        scanner.close();
    }
}
