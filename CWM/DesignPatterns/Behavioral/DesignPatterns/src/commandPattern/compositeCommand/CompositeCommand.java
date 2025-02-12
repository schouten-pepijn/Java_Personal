package commandPattern.compositeCommand;

import java.util.ArrayList;
import java.util.List;

import commandPattern.compositeCommand.fx.Commandable;

public class CompositeCommand implements Commandable {
    private List<Commandable> commands = new ArrayList<>();

    // Add a new command
    public void add(Commandable command) { 
        commands.add(command);
    }


    // Create the composite command
    @Override
    public void execute() {
        for (var command : commands)
            command.execute();
    }
}
