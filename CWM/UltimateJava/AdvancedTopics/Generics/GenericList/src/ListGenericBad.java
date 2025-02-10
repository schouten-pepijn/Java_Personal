public class ListGenericBad {
    private Object[] items = new Object[10];
    private int count;

    // adding new integers
    public void add(Object item) {
        items[count] = item;
        count++;
    }

    // get a item at an index
    public Object get(int index) {
        return items[index];
    }
}
