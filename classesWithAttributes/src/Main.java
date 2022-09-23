public class Main {
    public static void main(String[] args) {

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