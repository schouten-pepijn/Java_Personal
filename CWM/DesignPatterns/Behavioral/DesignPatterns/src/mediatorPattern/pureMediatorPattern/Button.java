package mediatorPattern.pureMediatorPattern;

public class Button extends UIControl {

    private boolean isEnabled;

    public Button(DialogBox owner) {
        super(owner);
    }
    
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        owner.changed(this);
    }

}
