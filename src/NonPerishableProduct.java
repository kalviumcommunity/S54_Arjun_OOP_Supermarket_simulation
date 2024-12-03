package src;

public class NonPerishableProduct extends Product implements Warranty {
    private String warrantyDetails;

    public NonPerishableProduct(String name, double price, String warrantyDetails) {
        super(name, price);
        this.warrantyDetails = warrantyDetails;
    }

    @Override
    public String getWarrantyDetails() {
        return warrantyDetails;
    }

    @Override
    public void setWarrantyDetails(String warrantyDetails) {
        this.warrantyDetails = warrantyDetails;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Warranty: " + this.warrantyDetails);
    }
}


