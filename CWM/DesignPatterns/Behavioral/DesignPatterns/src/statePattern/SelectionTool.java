package statePattern;

// Specific implementation
public class SelectionTool implements Toolable {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }
}
