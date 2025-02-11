package strategyPattern;

public class HighContrastFilter implements Filterable {

    @Override
    public void apply(String filename) {
        System.out.println("Applying high contrast filter");
    }

}
