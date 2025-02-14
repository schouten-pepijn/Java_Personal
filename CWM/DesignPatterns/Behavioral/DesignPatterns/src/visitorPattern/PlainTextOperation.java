package visitorPattern;

public class PlainTextOperation implements Visitor {


    @Override
    public void apply(HeadingNode node) {
        System.out.println("Plain text heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Plain text anchor");
    }
}
