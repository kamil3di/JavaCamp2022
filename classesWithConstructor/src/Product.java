public class Product {

    public Product(int id, String name, String features, double price, int stockAmount){
        System.out.println("Constructor olusturuldu!");
        this.id = id;
        this.name = name;
        this.features = features;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }

    private int id;
    private String name;
    private String features;
    private double price;
    private int stockAmount;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + this.id;
    }
}
