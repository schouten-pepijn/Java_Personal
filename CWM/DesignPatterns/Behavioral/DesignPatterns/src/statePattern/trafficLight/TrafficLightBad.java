package statePattern.trafficLight;


class TrafficLightBad {
    private String state = "RED";

    public void change() {
        if (state.equals("RED")) {
            System.out.println("Changing to GREEN");
            state = "GREEN";
        } else if (state.equals("GREEN")) {
            System.out.println("Changing to YELLOW");
            state = "YELLOW";
        } else if (state.equals("YELLOW")) {
            System.out.println("Changing to RED");
            state = "RED";
        }
    }
}

