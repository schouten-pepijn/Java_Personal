public class CustomArray {
    private int[] items;
    private int count;

    // create cunstructor
    public CustomArray(int length) {
        items = new int[length];
    }

    // create print method
    public void print() {
        for (int i = 0; i < count; i++) 
            System.out.println(items[i]);
    }

    // create insert method
    public void insert(int item) {
        // if full resize
        if (count == items.length) {
            // create new array
            int[] newItems = new int[count * 2];
            // copy old array
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            // set to new array
            items = newItems;
        }
        
        // add new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate index
        if (index < 0 || index >= count) 
            throw new IllegalArgumentException();
        
        // Shift items to the left
        for (int i = index; i < count; i++) 
            items[i] = items[i + 1];

        // Shrink array
        count--;
    }

    public int indexOf(int item) {
        // Search for item
        for (int i = 0; i < count; i++) 
            if (items[i] == item)
                return i;

        // Item not found
        return -1;
    }
}
