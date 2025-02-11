package statePattern.trafficLight;

class YellowLight implements TrafficLightState {
    public void change(TrafficLightContext context) {
        System.out.println("Changing to RED");
        context.setState(new RedLight());
    }
}
