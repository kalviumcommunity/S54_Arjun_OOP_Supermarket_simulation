package src;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerID;
    private ArrayList<Product> shoppingList;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.shoppingList = new ArrayList<>();
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer ID: " + this.customerID);
    }

    public void addProductToShoppingList(Product product) {
        shoppingList.add(product);
        System.out.println(product.name + " added to " + this.name + "'s shopping list.");
    }

    public void displayShoppingList() {
        System.out.println(this.name + "'s Shopping List:");
        for (Product product : shoppingList) {
            product.displayDetails();
            System.out.println("----------------------");
        }
    }

}
