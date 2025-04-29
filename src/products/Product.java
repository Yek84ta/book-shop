package products;

public abstract class Product {
    private String title;
    private double price;
    private String id;

    public Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nPrice: " + price;
    }

    protected abstract String generatedId();
}
