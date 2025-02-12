package commandPattern.compositeCommand;

import commandPattern.compositeCommand.fx.Commandable;

public class CropCommand implements Commandable {

    @Override
    public void execute() {
        System.out.println("Cropping");
    }
}
