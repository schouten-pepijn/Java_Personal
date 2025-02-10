import java.util.NoSuchElementException;

public class CustomLinkedList {
    // private class for a Node
    private class Node {
        private int value;
        private Node next;

        // Custom constructor for node class
        public Node(int value) {
            this.value = value;
        }
    }

    // create fields
    private Node first;
    private Node last;
    private int size;

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        // is the list empty?
        if (isEmpty())
            first = last = node;
        // add to the beginning
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        // is the list empty?
        if (isEmpty())
            first = last = node;
        // add to the end
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    // deleteFirst
    public void removeFirst() {
        // General logic
        // [10 -> 20 -> 30]
        // first -> 20 [20 -> 30]
        // catch for empty list
        if (isEmpty())
            throw new NoSuchElementException();
        // list with one element
        if (first == last) 
            first = last = null;  
        else {
            // list with more than one element 
            var second = first.next;
            // remove the link
            first.next = null;
            // update the first
            first = second;
        }

        size--;
    }

    // deleteLast
    public void removeLast() {
        // catch for empty list
        if (isEmpty())
            throw new NoSuchElementException();
        // only one element
        if (first == last) 
            first = last = null;
        else {
            // point last link to previous element
            var previous = getPrevious(last);
            last = previous;
            // remove the link
            last.next = null;
        }

        size--;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        // transverse the list
        while (current != null) {
            // if the item is found
            if (current.value == item)
                return index;
            // move to the next
            current = current.next;
            index++;
        }
        // not found
        return -1;

    }

    // size
    public int size() {
        return size;
    }

    // convert to array
    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {    
        var current = first;
        // transverse the list
        while (current != node) {
            // if the node is found
            if (current.next == node) return current;
            current = current.next;
        }
        // not found
        return null;
    }

    // reverse the linked list in place
    public void reverse() {
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }


    public int getKthFromTheEnd(int k) {
        // if the list is empty
        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;
        // move first pointer k-1 steps for distance
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            // if tranverse past the end
            if (b == null)
                throw new IllegalArgumentException();
        }
        // move both pointers
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        // a returns the kth element
        return a.value;
    }
}


