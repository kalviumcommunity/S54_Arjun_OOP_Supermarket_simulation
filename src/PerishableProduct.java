package src;

public class PerishableProduct extends Product {
    private int expiryDays;

    public PerishableProduct(String name, double price, int expiryDays) {
        super(name, price);
        this.expiryDays = expiryDays;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expires in: " + this.expiryDays + " days");
    }
}
