import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {

    // override compare method
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
