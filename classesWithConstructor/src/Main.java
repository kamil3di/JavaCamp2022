public class Main {
    public static void main(String[] args) {

        //This line calls parameter added constructor
//        Product product = new Product(13, "Asus Laptop", "Gaming", 30000, 5);

        //These below lines can be used whenever we want to use without parameter added constructor
        Product product = new Product();
        product.setName("HP Laptop");
        product.setFeatures("Gaming");
        product.setId(12);
        product.setPrice(10000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}