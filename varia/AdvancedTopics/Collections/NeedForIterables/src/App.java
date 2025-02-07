public class App {
    public static void main(String[] args) throws Exception {
        var list = new GenericList<String>();
        list.add("A");
        list.add("B");

        
        // create a new iterator
        var iterator = list.iterator();
        // [A, B, C]
        //  ^ 

        // iterate over an object that has an iterable
        while (iterator.hasNext()) {
            // get the next item
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
