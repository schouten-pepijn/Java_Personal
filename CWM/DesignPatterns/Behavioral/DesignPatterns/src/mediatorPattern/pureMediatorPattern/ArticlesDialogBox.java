package mediatorPattern.pureMediatorPattern;

public class ArticlesDialogBox extends DialogBox {
    private ListBox artilesListbox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        artilesListbox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Textbox: " + titleTextBox.getContent());
        System.out.println("Save button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if (control == artilesListbox) 
            articleSelected();
        else if (control == titleTextBox)
            titleChanged();
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
