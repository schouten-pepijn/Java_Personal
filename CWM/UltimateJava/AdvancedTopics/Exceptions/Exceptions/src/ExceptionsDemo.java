import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    private float balance = 0;

    public static void show() {
        // try-with-resources block
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("fileOut.txt");
        ) {
            var value = reader.read();
        } catch (IOException e) {  // catch block
            System.out.println("File not found " + e.getMessage());
        } finally {  // finally block
            System.out.println("finally block");
        }
    }

    // method with exception throws
    public static void account(int number) throws IOException {
        // throw exception (defencive programming)
        if (number <= 0)
            throw new IllegalArgumentException("number must be > 0");
    }

    // method with custom exception throws
    public void withdraw(float value) throws NoBalanceException {
        if (value > balance) {
            throw new NoBalanceException("No balance");
        }
    }

    // method with custom chained exception throws
    public void withdrawChain(float value) throws AccountException {
        if (value > balance)
            throw new AccountException(new NoBalanceException());
    }
}

