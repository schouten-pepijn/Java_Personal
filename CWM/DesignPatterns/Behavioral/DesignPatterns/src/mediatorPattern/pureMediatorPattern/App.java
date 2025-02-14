package mediatorPattern.pureMediatorPattern;

public class App {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
