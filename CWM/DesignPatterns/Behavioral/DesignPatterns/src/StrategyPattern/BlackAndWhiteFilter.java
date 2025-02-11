package strategyPattern;

public class BlackAndWhiteFilter implements Filterable {

    @Override
    public void apply(String filename) {
       System.out.println("Applying b&w Filter");
    }

}
