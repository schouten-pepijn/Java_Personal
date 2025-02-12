package observerPattern.weatherStation;

public class PhoneObserver implements Observerable {
    private float temperature;


    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        System.out.println("Phone temperature is " + temperature);
    }
}
