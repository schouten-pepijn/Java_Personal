package mediatorPattern.mediatorObserverPattern;

public class ListBox extends UIControl {
    private String selection;
    
    public String getSelection() {
        return selection;
    }

    protected void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }

}
