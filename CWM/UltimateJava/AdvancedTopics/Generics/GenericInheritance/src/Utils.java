public class Utils {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) < 0) ? b : a;
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // public static void printUser(ListGenericGood<User> users) {
    //     Utils.printUser(users);
    // }

    // Wildcard syntax (capture of unknown type)
    // class CAP#1 extends User {}
    // with extends you can only read from it
    
    public static void printUser(
        ListGenericGood<? extends User> users) {
        User x = users.get(0);
    }
    
    // super keyword makes storing in the list possible (as object)
    /* 
    public static void printUser(
        ListGenericGood<? super User> users) {
        System.out.println(users);
    }
    */

}
