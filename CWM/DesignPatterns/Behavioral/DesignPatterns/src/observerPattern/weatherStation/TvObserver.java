package observerPattern.weatherStation;

public class TvObserver implements Observerable {

    private float temperature;
    
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        printTemperature();
    }

    private void printTemperature( ) {
        System.out.println("TV temperature is " + temperature);
    }
}