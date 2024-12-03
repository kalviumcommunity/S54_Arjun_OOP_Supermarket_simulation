package src;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> shoppingList;

    public ShoppingCart() {
        shoppingList = new ArrayList<>();
    }

    public void addProductToShoppingList(Product product) {
        shoppingList.add(product);
    }

    public void displayShoppingList() {
        for (Product product : shoppingList) {
            product.displayDetails();
        }
    }
}

