package observerPattern.weatherStation;

public interface Subjectable {
    void addObserver(Observerable observer);
    void removeObserver(Observerable observer);
    void notifyObservers();
}
