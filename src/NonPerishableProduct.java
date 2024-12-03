package src;

public class NonPerishableProduct extends Product {
    private String warranty;

    public NonPerishableProduct(String name, double price, String warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Warranty: " + this.warranty);
    }
}

