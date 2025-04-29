package products;

import java.util.ArrayList;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int creationCode;

    public Book(String title, double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.genre = genre;
        this.publication = publication;
        creationCode ++;
        this.setId(generatedId());

    }

    @Override
    protected String generatedId(){
        return String.valueOf((1000 + creationCode));
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nAuthor: " + author + "\nPublication: " + publication + "\nGenre: " + genre;
    }

    public static int getCreationCode() {
        return creationCode;
    }

    public static void setCreationCode(int creationCode) {
        Book.creationCode = creationCode;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublication() {
        return publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setAuthor(String author) {
        this.author = author;
    } // lazemeh baray field hay product ham inja getter ina bezarim.

}
