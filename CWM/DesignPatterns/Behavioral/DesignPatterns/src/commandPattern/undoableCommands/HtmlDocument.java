package commandPattern.undoableCommands;


public class HtmlDocument {
    private String content;

    public void makeBold() {
        // buisness logic
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
