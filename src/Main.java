import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;
import products.Product;

public class Main {
    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        Book book1 = new Book("Java Programming", 999.99, "John Doe", "Tech Publications", "Educational");
        Book book2 = new Book("The Great Novel", 283.99, "Jane Smith", "Literary House", "Fiction");
        bookInventory.addItem(book1);
        bookInventory.addItem(book2);

        Notebook notebook1 = new Notebook("Spiral Notebook", 105.99, false, 120);
        Notebook notebook2 = new Notebook("Hardcover Notebook", 213.99, true, 80);
        notebookInventory.addItem(notebook1);
        notebookInventory.addItem(notebook2);

        Accessory accessory1 = new Accessory("Blue Pen", 78.99, "Blue");
        Accessory accessory2 = new Accessory("Red Pencil", 93.55, "Red");
        accessoryInventory.addItem(accessory1);
        accessoryInventory.addItem(accessory2);

        System.out.println("===== All Books =====");
        bookInventory.displayAll();
        System.out.println("===== All Notebooks =====");
        notebookInventory.displayAll();
        System.out.println("===== All Accessories =====");
        accessoryInventory.displayAll();

        System.out.println("===== Removing Items =====");
        bookInventory.removeItemsById(book1.getId());
        accessoryInventory.removeItemsById(accessory1.getId());

        System.out.println("===== Total Prices =====");
        System.out.println("Total price of Books: " + calculateTotalPrice(bookInventory));
        System.out.println("Total price of Notebooks: " + calculateTotalPrice(notebookInventory));
        System.out.println("Total price of Accessories: " + calculateTotalPrice(accessoryInventory));

        System.out.println("===== Searching Items =====");
        System.out.println("Searching for existing Notebook:");
        Notebook foundNotebook = notebookInventory.findItemsById(notebook2.getId());
        if (foundNotebook != null) {
            System.out.println("Found: " + foundNotebook.getTitle());
        }

        System.out.println("Searching for non-existing Book:");
        Book nonExistingBook = bookInventory.findItemsById("9999");

        System.out.println("===== Applying Discounts =====");
        notebookInventory.applyDiscount("Hardcover Notebook", 10);
        accessoryInventory.applyDiscount("Red Pencil", 20);

        System.out.println("===== Final Product List =====");
        System.out.println("===== Books =====");
        bookInventory.displayAll();
        System.out.println("===== Notebooks =====");
        notebookInventory.displayAll();
        System.out.println("===== Accessories =====");
        accessoryInventory.displayAll();
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product product : inventory.getItems()) {
            total += product.getPrice();
        }
        return total;
    }
}