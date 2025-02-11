package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    // Creates the iterator
    public Iteratorable<String> createIterator() {
        return new ListIterator(this);
    }

    // Concrete implementation of iteratorable interface
    public class ListIterator implements Iteratorable<String> {
        
        private BrowseHistory history;
        private int index;
        
        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        // Has next method
        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        // Current method
        @Override
        public String current() {
            return history.urls.get(index);
        }

        // Next method
        @Override
        public void next() {
            index++;
        }      
    }
}
