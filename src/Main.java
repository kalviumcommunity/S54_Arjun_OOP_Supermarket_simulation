package src;

public class Main {
    public static void main(String[] args) {
        
        Product[] products = new Product[5];

        products[0] = new Product("Shampoo", 5.99);
        products[1] = new Product("Conditioner", 6.99);
        products[2] = new PerishableProduct("Milk", 2.49, 7);
        products[3] = new PerishableProduct("Bread", 1.99, 3);
        products[4] = new PerishableProduct("Cheese", 4.50, 10);

        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);

        customer1.addProductToShoppingList(products[0]);
        customer1.addProductToShoppingList(products[2]);

        customer2.addProductToShoppingList(products[1]);
        customer2.addProductToShoppingList(products[3]);

        System.out.println("Customer Details:");
        customer1.displayCustomerDetails();
        System.out.println("----------------------");
        customer2.displayCustomerDetails();

        System.out.println("\nShopping Lists:");
        customer1.displayShoppingList();
        System.out.println("----------------------");
        customer2.displayShoppingList();
    }
}
