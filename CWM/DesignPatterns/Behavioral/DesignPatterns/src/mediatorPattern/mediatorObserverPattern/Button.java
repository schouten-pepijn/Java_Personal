package mediatorPattern.mediatorObserverPattern;

public class Button extends UIControl {

    private boolean isEnabled;
    
    public boolean isEnabled() {
        return isEnabled;
    }

    protected void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        notifyEventHandlers();
    }

}
