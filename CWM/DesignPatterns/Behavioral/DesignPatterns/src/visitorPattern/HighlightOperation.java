package visitorPattern;

public class HighlightOperation implements Visitor {

    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlight heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Highlight anchor");
    }
}
