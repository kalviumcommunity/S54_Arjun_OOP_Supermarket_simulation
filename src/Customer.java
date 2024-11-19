package src;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerID;
    private ArrayList<Product> shoppingList;

    private static int customerCount = 0;

    public Customer() {
        this.name = "Unnamed Customer";
        this.customerID = 0;
        this.shoppingList = new ArrayList<>();
        customerCount++;
    }

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.shoppingList = new ArrayList<>();
        customerCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void addProductToShoppingList(Product product) {
        shoppingList.add(product);
        System.out.println(product.getName() + " added to " + this.name + "'s shopping list.");
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer ID: " + this.customerID);
    }

    public void displayShoppingList() {
        System.out.println(this.name + "'s Shopping List:");
        for (Product product : shoppingList) {
            product.displayDetails();
            System.out.println("----------------------");
        }
    }

    public void deleteCustomer() {
        customerCount--;
        System.out.println("Customer deleted: " + this.name);
    }
}
