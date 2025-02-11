package iteratorPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // Changing the internals of this object has consequences for the main class!!
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
