package visitorPattern;

public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Visitor visitor) {
        // Anchornode apply
        visitor.apply(this);
    }
}
