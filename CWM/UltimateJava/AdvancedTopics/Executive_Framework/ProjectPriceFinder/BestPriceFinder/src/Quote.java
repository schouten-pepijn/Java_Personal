public class Quote {
    private final String site;
    private final int price;

    // constructor
    public Quote(String site, int price) {
        this.site = site;
        this.price = price;
    }

    // getters
    public int getPrice() {
        return price;
    }

    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }



    
    
}
