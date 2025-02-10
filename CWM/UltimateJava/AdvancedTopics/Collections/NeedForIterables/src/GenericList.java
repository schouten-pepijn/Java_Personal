// create generic class (T is type of objects)
// with constraint Numbers

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
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

    // create iterator method
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this) {
        };
    }

    // create listIterator class
    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        // constructor
        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        // hasNext method
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        // next method
        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
