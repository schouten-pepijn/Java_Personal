public class App {

    public static void main(String[] args) {

        // Main class is coupled with the User class
        User user = new User("Bob");

        System.out.println(user.name);


        // Change public field
        user.name = "John";

        System.out.println(user.name);

        user.printName();
    }
}
