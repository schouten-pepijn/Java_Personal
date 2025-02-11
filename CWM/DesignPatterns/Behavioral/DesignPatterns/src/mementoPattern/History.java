package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    // List to store the history
    private List<EditorState> states = new ArrayList<>();

    // Add new content to history
    public void push(EditorState state) {
        states.add(state);
    }

    // Remove last item from history and return it
    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
