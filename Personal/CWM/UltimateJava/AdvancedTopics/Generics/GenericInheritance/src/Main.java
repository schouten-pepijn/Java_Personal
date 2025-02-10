public class Main {
    public static void main(String[] args) throws Exception {
        // inherit from the parent class
        User user = new Instructor(10);

        // polymorphism (both classes related to the same method)
        Utils.printUser(new User(10));
        Utils.printUser(new Instructor(10));

        var users = new ListGenericGood<User>();
        Utils.printUser(users);
        
        // ListGenericGood<Instructor> is not a subclass of ListGenericGood<User> but a single class on its own
        var instructors = new ListGenericGood<Instructor>();
        Utils.printUser(instructors);
    }
}
