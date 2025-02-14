package mediatorPattern.mediatorObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> handlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        handlers.add(observer);
    }

    public void notifyEventHandlers() {
        for (var observer : handlers) {
            observer.handle();
        }
    }

}
