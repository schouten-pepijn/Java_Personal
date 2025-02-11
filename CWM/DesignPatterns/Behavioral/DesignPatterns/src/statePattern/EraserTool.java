package statePattern;

public class EraserTool implements Toolable {

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing something");
    }
}
