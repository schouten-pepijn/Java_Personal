package commandPattern.undoableCommands;

public class UndoCommand implements Actionable {
    private History history;


    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
