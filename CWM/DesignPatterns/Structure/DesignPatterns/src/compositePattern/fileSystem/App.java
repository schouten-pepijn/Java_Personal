package compositePattern.fileSystem;

public class App {
    public static void main(String[] args) throws Exception {
        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");

        Directory directory1 = new Directory("Directory 1");
        Directory directory2 = new Directory("Directory 2");
        
        directory1.addComponent(file1);
        directory1.addComponent(file2);
        directory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root");
        
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);
        
        rootDirectory.showDetails();
    }
}
