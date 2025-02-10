public class Main {
    public static void main(String[] args) throws Exception {
    
        User user1 = new User(1);
        User user2 = new User(2);

        System.out.println(user1.compareTo(user2));
    }
}
