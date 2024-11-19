package src;

public class Product {
    private String name;
    private double price;

    private static int productCount = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getProductCount() {
        return productCount;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
    }

    public void deleteProduct() {
        productCount--;
        System.out.println("Product deleted: " + this.name);
    }
}
