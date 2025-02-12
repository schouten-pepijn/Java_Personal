package observerPattern.weatherStation;

public class App {
    public static void main(String[] args) {
        WeatherStationSubject weatherstation = new WeatherStationSubject();

        Observerable tv = new TvObserver();
        Observerable phone = new PhoneObserver();

        weatherstation.addObserver(tv);
        weatherstation.addObserver(phone);

        System.out.println("Set temperature to 20");
        weatherstation.setTemperature(20);

        System.out.println("Set temperature to 30");
        weatherstation.setTemperature(30);
        
    }

}
