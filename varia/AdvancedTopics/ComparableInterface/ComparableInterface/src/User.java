// type safe comparisons
public class User implements Comparable<User> {
    private int value;

    // constructor
    public User(int value) {
        this.value = value;
    }

    // type safe comparison
    @Override
    public int compareTo(User other) {
        return value - other.value;
    }
    
}
