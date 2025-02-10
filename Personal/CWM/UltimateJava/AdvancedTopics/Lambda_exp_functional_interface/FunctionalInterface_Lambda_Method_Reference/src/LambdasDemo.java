public class LambdasDemo {
    public static String prefix = "-";
    public String postfix = "!";

    // programming against an interface
    public static void show() {
        greet(new ConsolePrinter());
    }


    // programming against an anonymous inner class
    public static void showInner() {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }


    // programming against a lambda expression
    public void showLambda() {
        // method as a lambda expression (with static variable capture)
        greet(message -> System.out.println(prefix + message));

        // method as a lambda expression (with instance variable capture)
        greet((message) -> System.out.println(message + this.postfix));
        
        // object as a lambda expression
        Printer printer = message -> System.out.println(message);
        printer.print("lambda!");

        // Class/Object::method
        // method reference
        greet(System.out::println);

        // Class::method
        // class method reference
        greet(message -> printClass(message));
        greet(LambdasDemo::printClass);

        // Object::method
        // this::method
        // instance method reference
        greet(message -> printInstance(message));
        greet(this::printInstance);
        var lambdasdemo = new LambdasDemo();
        greet(lambdasdemo::printInstance);

        // Class::new
        // constructor reference
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);
    }

    public static void printClass(String message) {}

    public void printInstance(String message) {}


    // constructors
    public LambdasDemo(String message) {}

    public LambdasDemo() {}

    public static void greet(Printer printer) {
        printer.print("Hello");
    }
}
