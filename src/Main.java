package src;
public class Main {
    public static void main(String[] args) {
        // Product product1 = new Product("Shampoo", 5.99);
        // Product product2 = new Product("Conditioner", 6.99);
        // Product product3 = new PerishableProduct("Milk", 2.49, 7);
        // Product product4 = new PerishableProduct("Bread", 1.99, 3);
        // Product product5 = new PerishableProduct("Cheese", 4.50, 10);

        Product product1 = new Product("Shampoo", 5.99);
        PerishableProduct product2 = new PerishableProduct("Milk", 2.49, 7);
        NonPerishableProduct product3 = new NonPerishableProduct("Laptop", 999.99, "1 Year");

        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob");

        customer1.addProductToShoppingList(product1);
        customer1.addProductToShoppingList(product3);

        customer2.addProductToShoppingList(product2);

        customer1.displayCustomerDetails();
        customer1.displayShoppingList();

        customer2.displayCustomerDetails();
        customer2.displayShoppingList();

        System.out.println("Total Products Created: " + Product.getProductCount());
        System.out.println("Total Customers Created: " + Customer.getCustomerCount());

        product1.deleteProduct();
        product2.deleteProduct();
        product3.deleteProduct();

        customer1.deleteCustomer();
        customer2.deleteCustomer();

        System.out.println("Products remaining after deletion: " + Product.getProductCount());
        System.out.println("Customers remaining after deletion: " + Customer.getCustomerCount());
    }
}
