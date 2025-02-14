package visitorPattern;

public interface Visitor {
    // Overload the apply method
    // Only useful if object structure is stable
    void apply(HeadingNode node);
    void apply(AnchorNode node);
}