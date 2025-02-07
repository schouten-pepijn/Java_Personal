public class Main {
    public static void main(String[] args) {
        CustomArray numbers = new CustomArray(3);
        // print empty array
        numbers.print();

        // add more items than length
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);

        numbers.print();

        // remove some index
        numbers.removeAt(1);

        numbers.print();

        // search for item
        int index = numbers.indexOf(4);
        System.out.println("Index of 4: " + index);
    }
}
