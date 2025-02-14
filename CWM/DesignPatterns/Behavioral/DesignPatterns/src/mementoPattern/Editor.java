package mementoPattern;

public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    // Restore editor state from history
    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
