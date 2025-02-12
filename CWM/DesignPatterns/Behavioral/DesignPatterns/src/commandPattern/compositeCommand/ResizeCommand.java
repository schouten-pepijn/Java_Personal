package commandPattern.compositeCommand;

import commandPattern.compositeCommand.fx.Commandable;

public class ResizeCommand implements Commandable {

    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
