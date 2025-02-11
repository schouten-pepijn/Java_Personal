public class App {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();


        // Set content in the editor and push it to the history
        editor.setContent("Hello");
        history.push(editor.createState());

        editor.setContent("World");
        history.push(editor.createState());

        // Restore the last state by undoing the last action
        editor.setContent("!");
        editor.restore(history.pop());

        // Print the results
        System.out.println(editor.getContent());



    }
}