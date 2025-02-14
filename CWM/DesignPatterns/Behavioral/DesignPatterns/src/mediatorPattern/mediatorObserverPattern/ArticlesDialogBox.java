package mediatorPattern.mediatorObserverPattern;

public class ArticlesDialogBox {
    private ListBox artilesListbox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    // Implement observer interface
    public ArticlesDialogBox() {
        // Event handlers
        artilesListbox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        artilesListbox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Textbox: " + titleTextBox.getContent());
        System.out.println("Save button: " + saveButton.isEnabled());
    }

    public void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(artilesListbox.getSelection());
        saveButton.setEnabled(true);
    }

}
