public abstract class UIControl {
    // fields
    private boolean isEnabled = true;

    // constructor
    public UIControl() {
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    // generate method for rendering
    public abstract void render();

    // methods
    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    // getters
    public boolean isEnabled() {
        return isEnabled;
    }
}
