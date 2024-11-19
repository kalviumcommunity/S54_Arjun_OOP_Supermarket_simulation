package src;

public class NonPerishableProduct extends Product {
    private String warranty;

    public NonPerishableProduct(String name, double price, String warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + this.warranty);
    }
}
