package src;

public class PerishableProduct extends Product implements Perishable {
    private int expiryDays;

    public PerishableProduct(String name, double price, int expiryDays) {
        super(name, price);
        this.expiryDays = expiryDays;
    }

    @Override
    public int getExpiryDays() {
        return expiryDays;
    }

    @Override
    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Expires in: " + this.expiryDays + " days");
    }
}

