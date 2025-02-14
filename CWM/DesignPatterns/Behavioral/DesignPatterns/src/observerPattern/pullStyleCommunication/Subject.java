package observerPattern.pullStyleCommunication;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
        
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Push a new value in the update method
    public void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
