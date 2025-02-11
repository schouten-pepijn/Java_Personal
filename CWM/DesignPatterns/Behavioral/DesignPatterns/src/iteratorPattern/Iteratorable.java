package iteratorPattern;

public interface Iteratorable<T> {
    boolean hasNext();
    T current();
    void next();
}