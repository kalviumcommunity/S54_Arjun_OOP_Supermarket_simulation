package src;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerID;
    private ArrayList<Product> shoppingList;

    private static int customerCount = 0;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.shoppingList = new ArrayList<>();
        customerCount++;
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


    public void deleteCustomer() {
        customerCount--;
        System.out.println("Customer deleted: " + this.name);
    }
}
