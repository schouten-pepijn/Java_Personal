public class Customer implements Comparable<Customer> {
    private String name;
    private String Email;

    // constructor
    public Customer(String name, String email) {
        this.name = name;
        Email = email;
    }

    // Not flexible (only compares names)
    @Override
    public int compareTo(Customer other) {
        // this < other -> -1
        // this == other -> 0
        // this > other -> 1
        return name.compareTo(other.name);
    }

    // override toString method
    @Override
    public String toString() {
        return name;
    }

    // getter for EmailComparator
    public String getEmail() {
        return Email;
    }
}
