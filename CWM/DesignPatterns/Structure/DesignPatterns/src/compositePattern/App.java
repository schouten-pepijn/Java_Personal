package compositePattern;

public class App {
    public static void main(String[] args) {
        
        Group group1 = new Group();

        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();

        group2.add(new Shape());
        group2.add(new Shape());

        // Combine
        Group group = new Group();

        group.add(group1);
    }

}
