package iteratorPattern;

public class App {
    public static void main(String[] args) {

        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        // Program against the interface
        Iteratorable<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }

}
