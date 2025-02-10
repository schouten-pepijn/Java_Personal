public class UserList {
    private User[] users = new User[10];
    private int count = 0;

    public void add(User user) {
        users[count] = user;
        count++;
    }

    public User get(int index) {
        return users[index];
    }
}
