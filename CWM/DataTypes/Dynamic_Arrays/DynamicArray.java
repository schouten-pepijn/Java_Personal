import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {   
        // Vector updates with 100% - synchronized
        // ArrayList updates with 50% - not synchronized 

        // Create a dynamic array
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Remove elements
        list.remove(0);

        System.out.println(list);

        // get size
        System.out.println(list.size()); 
    }
}