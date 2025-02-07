public class Main {
    public static void main(String[] args) {
        var list = new CustomLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.deleteFirst();

        System.out.println(list.indexOf(20));

        System.out.println(list.contains(10));

    }
}
