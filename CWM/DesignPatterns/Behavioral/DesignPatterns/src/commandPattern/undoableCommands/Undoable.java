package commandPattern.undoableCommands;

// Interface for undoable commands
public interface Undoable extends Actionable {
    void unexecute();
}
