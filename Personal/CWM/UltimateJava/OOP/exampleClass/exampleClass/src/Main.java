public class Main {
    public static void main(String[] args) {
        TextBox textbox = new TextBox();  // instance of a class
        // reference from the stack (var) to the heap (new)

        var textbox2 = new TextBox();  // var is a shortcut for type inference
 
        textbox.setText("Box 1");  // call a method
        System.out.println(textbox.text.toUpperCase());

        textbox2.setText("Box 2");
        System.out.println(textbox2.text.toUpperCase());

    }
}
