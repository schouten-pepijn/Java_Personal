package statePattern;

// Delegating what should happen
public class Canvas {
    private Toolable currentTool;


    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Toolable getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Toolable currentTool) {
        this.currentTool = currentTool;
    }
}
