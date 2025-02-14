package observerPattern.noCommunication;

public class SpreadSheet implements Observer {


    @Override
    public void update() {
        System.out.println("Spreadsheet updated");
    }
}
