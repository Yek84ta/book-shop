package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList <T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) {
        for (T t : items) {
            if (t.getTitle().equals(productName)) {
                t.setPrice(t.getPrice() * (100 - discount) * 0.01);
                System.out.println("The discount you wanted has been applied to your items. Enjoy your savings!");
                return;
            }
        }
        throw new IllegalArgumentException("Sorry, " + productName + " is currently out of stock. Let us know if you need help finding an alternative!");
    }

    public void addItem (T product){
        items.add(product);
        System.out.println("Product added successfully.");
    }

    public void removeItemsById ( String id){
        for(T product : items){
            if (product.getId().equals(id)) {
                items.remove(product);
                System.out.println("Product removed successfully.");
                return;
            }
        }

        throw new IllegalArgumentException("Sorry, the product with mentioned ID is currently out of stock.\n Let us know if you need any assistance!");
    }

    public T findItemsById ( String id){
        for(T product : items){
            if (product.getId().equals(id))
                return product;
        }
        System.out.println("Sorry, the product with ID \" + id + \" is currently out of stock.\n Let us know if you need any assistance!");
        return null;

    }

    public void displayAll() {
        for (T product : items) {
            System.out.println(product.toString());
            System.out.println("-------------------");
        }
    }
}
