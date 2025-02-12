package commandPattern.singleCommand;

import commandPattern.singleCommand.fx.Button;

public class App {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();

        
    }
}
