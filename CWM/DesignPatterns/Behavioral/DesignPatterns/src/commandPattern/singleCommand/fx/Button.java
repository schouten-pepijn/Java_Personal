package commandPattern.singleCommand.fx;

public class Button {
    private String label;
    // store the command object
    private Commandable command;

    public Button(Commandable command) {
        this.command = command;
    }

    // Delegate the work to the command interface
    public void click() {
        command.execute();
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
