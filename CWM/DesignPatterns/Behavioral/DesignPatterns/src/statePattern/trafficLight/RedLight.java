package statePattern.trafficLight;

// Concrete states
class RedLight implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing to GREEN");
        context.setState(new GreenLight());
    }
}