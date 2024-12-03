package src;

public class Customer {
    private String name;
    private int customerID;
    private ShoppingCart shoppingCart;  
    private static int customerCount=0;

    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
        this.shoppingCart = new ShoppingCart();
        customerCount++;
    }
        public Customer(String name) {
        this.name = name;
        this.customerID = 0;
        this.shoppingCart = new ShoppingCart();
        customerCount++;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer ID: " + this.customerID);
    }

    public void addProductToShoppingList(Product product) {
        shoppingCart.addProductToShoppingList(product);
    }

    public void displayShoppingList() {
        shoppingCart.displayShoppingList();
    }

    public void deleteCustomer() {
        customerCount--;
        System.out.println("Customer deleted: " + this.name);
    }

    public static int getCustomerCount() {
        return customerCount;
    }
}
