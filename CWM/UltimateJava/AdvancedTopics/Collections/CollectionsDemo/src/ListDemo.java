import java.util.ArrayList;
import java.util.List;

// List extends Collection
public class ListDemo {
    public static void show() {
    // create list object of type String
    List<String> list = new ArrayList<>();

    list.add("a");

    // add by index
    list.add(1, "1");

    System.out.println(list);

    }
    
}
