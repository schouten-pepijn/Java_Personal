// create generic class (T is type of objects)
// with constraint Numbers
public class ListGenericGood<T extends Number> {
    @SuppressWarnings("unchecked")
    // create a generic array
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
