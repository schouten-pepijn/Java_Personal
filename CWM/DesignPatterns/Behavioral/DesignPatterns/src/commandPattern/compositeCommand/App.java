package commandPattern.compositeCommand;

import commandPattern.compositeCommand.fx.Button;

public class App {
    public static void main(String[] args) {
        var composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new CropCommand());

        // composite.execute();
        var button = new Button(composite);

        button.click();

    }
}
