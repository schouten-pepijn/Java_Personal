public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        // equals on memory reference
        System.out.println(point1 == point2);

        // equals on coordinates
        System.out.println(point1.equals(point2));

        // polymorphism
        UIControl[] controls =  {new TextBox(), new CheckBox()};

        for (UIControl control : controls) {
            // procedural would require a lot of code like if else statements
            // polymorphism allows us to use the same method for different objects
            control.render();
        }







    }
}
