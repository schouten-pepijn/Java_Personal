package statePattern.trafficLight;


public class TrafficLightGood {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext(new RedLight());
        trafficLight.change(); // Changing to GREEN
        trafficLight.change(); // Changing to YELLOW
        trafficLight.change(); // Changing to RED
    }
}

