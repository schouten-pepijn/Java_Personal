public class List {
    private int[] items = new int[10];
    private int count;

    // adding new integers
    public void add(int item) {
        items[count] = item;
        count++;
    }

    // get a item at an index
    public int get(int index) {
        return items[index];
    }
}
