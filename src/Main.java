package src;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Shampoo", 5.99);
        Product product2 = new Product("Conditioner", 6.99);
        Product product3 = new PerishableProduct("Milk", 2.49, 7);
        Product product4 = new PerishableProduct("Bread", 1.99, 3);

        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);

        customer1.addProductToShoppingList(product1);
        customer1.addProductToShoppingList(product3);

        customer2.addProductToShoppingList(product2);
        customer2.addProductToShoppingList(product4);

        customer1.displayCustomerDetails();
        customer1.displayShoppingList();

        customer2.displayCustomerDetails();
        customer2.displayShoppingList();
    }
}
