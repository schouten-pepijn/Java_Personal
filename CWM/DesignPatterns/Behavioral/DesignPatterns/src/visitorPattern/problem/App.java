package visitorPattern.problem;

public class App {
    public static void main(String[] args) {
        var document = new HtmlDocument();

        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.highlight();
    }

}
