package products;

import java.util.ArrayList;

public class Accessory extends Product{
    private String color;
    private static int creationCode;

    public Accessory(String title, double price, String color) {
        super(title, price);
        this.color = color;
        creationCode ++;
        this.setId(generatedId());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }

    @Override
    protected String generatedId() {
        return String.valueOf((3000 + creationCode));
    }
}
