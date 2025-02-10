import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Demo of Collections Interface
        /* 
        CollectionsDemo.show();
        */

        // Demo of List Interface
        /* 
        ListDemo.show();
        */

        // Deom of Queue Interface
        /*
        QueueDemo.show();
        */

        // Demo of Set Interface
        /*
        SetDemo.show();
        */

        // Demo of Map Interface
        MapDemo.show();


        // Sorting data with comparable interface
        /* 
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));

        // Implement comparable interface in customer class
        Collections.sort(customers);
        System.out.println(customers);
        */

        // Sorting data with comparator interface
        /*
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
        */
    }
}

