public class TextBox extends UIControl {
    // fields
    private String text = "";

    // constructor
    public TextBox() {
        // should be on top for inherentance
        super(true);
        System.out.println("TextBox");
    }
    

    // override render method
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    // override toString method
    @Override
    public String toString() {
        return text;
    }

    // methods
    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
