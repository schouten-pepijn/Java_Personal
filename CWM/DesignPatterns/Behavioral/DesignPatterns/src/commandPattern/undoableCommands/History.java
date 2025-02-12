package commandPattern.undoableCommands;

import java.util.ArrayDeque;
import java.util.Deque;

// Storing the history in a memento pattern
public class History {
    private Deque<Undoable> commands = new ArrayDeque<>();

    public void push(Undoable command) {
        commands.add(command);
    }

    public Undoable pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }

}
