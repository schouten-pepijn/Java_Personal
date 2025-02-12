package commandPattern.undoableCommands;

// Delegating the buisness logic
public class BoldCommand implements Undoable {

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    // Restore the previous state
    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    // Store the previous state
    // Delegating the buisness logic
    // Store the current state
    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
