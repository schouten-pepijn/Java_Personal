package statePattern.trafficLight;

// Context class
class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext(TrafficLightState state) {
        this.state = state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}
