package visitorPattern;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Visitor visitor) {
        // Headingnode apply
        visitor.apply(this);
    }
}
