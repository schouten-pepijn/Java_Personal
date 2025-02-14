package mediatorPattern.mediatorObserverPattern;

public class TextBox extends UIControl {
    
    private String content;

    public String getContent() {
        return content;
    }

    protected void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    } 
}
