// Create a new class
public class TextBox {
    public String text = "";  // Field

    public void setText(String text) {  // Method
        this.text = text;  // use this. to refer to the field
    }

    public void clear() {
        text = "";
    }
}
