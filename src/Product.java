package src;

public class Product {
    protected String name;
    protected double price;
    

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
    }


    public double getPrice() {
        return this.price;
    }

}
