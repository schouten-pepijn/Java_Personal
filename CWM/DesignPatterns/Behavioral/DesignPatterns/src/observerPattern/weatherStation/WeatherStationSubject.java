package observerPattern.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationSubject implements Subjectable {
    private List<Observerable> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observerable observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observerable observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer : observers)
            observer.update(temperature);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
