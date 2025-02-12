package commandPattern.compositeCommand;

import commandPattern.compositeCommand.fx.Commandable;

public class AddCustomerCommand implements Commandable {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
