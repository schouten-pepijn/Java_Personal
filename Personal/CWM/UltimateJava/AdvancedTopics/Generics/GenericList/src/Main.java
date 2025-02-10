public class Main {
    public static void main(String[] args) throws Exception {
        // List with one type
        var list = new List();
        list.add(1);

        var users = new UserList();
        users.add(new User());

        // Bad solution for a generic list
        // 
        var listGeneric = new ListGenericBad();
        listGeneric.add(new User());
        listGeneric.add(1);
        listGeneric.add("1");

        // throws a ClassCastException at runtime
        try {
            int number = (int) listGeneric.get(0);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        // Good solution for a generic list
        var list2 = new ListGenericGood<Integer>();
        list2.add(1); // boxing
        int number = list2.get(0); // unboxing

        // gives error because the constraint
        var list3 = new ListGenericGood<String>();
        list3.add("1");
        String number2 = list3.get(0);
    }
}
