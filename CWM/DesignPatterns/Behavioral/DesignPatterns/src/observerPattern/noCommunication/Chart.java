package observerPattern.noCommunication;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("Chart updated");
    }
}
