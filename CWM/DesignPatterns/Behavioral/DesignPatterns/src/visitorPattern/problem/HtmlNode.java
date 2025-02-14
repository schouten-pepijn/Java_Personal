package visitorPattern.problem;

public interface HtmlNode {
    void highlight();
    // String plainText(); must be implemented in every subclass
    // Violates the open-closed principle
}
