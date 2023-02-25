package SupplierInterface;

public class Product {
    public Product(Integer id, String productName, Integer price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName='" + productName + '\'' + ", price=" + price + '}';
    }

    Integer id;
    String productName;
    Integer price;
}
