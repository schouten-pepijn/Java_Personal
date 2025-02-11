package statePattern.trafficLight;

class GreenLight implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing to YELLOW");
        context.setState(new YellowLight());
    }
}
