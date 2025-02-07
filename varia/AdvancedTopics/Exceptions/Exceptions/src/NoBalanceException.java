// CUSTOM EXCEPTION
// Checked -> Exception
// Unchecked (runtime) -> RuntimeException

public class NoBalanceException extends Exception {

    public NoBalanceException() {
        super("No balance");
    }

    public NoBalanceException(String message) {
        super(message);
    }
}
