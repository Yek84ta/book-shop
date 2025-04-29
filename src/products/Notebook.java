package products;

import java.util.ArrayList;

public class Notebook extends Product{
    private boolean isHardCover;
    private int pageCount;
    private static int creationCode;

    public Notebook(String title, double price, boolean isHardCover, int pageCount) {
        super(title, price);
        this.isHardCover = isHardCover;
        this.pageCount = pageCount;
        creationCode ++;
        this.setId(generatedId());

    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public boolean getIsHardCover() {
        return isHardCover;
    }

    @Override
    protected String generatedId() {
        return String.valueOf((2000 + creationCode));
    }

    @Override
    public String toString() {
        return super.toString() + "\nPage Count: " + pageCount + "\nHard Cover: " + (isHardCover ? "Yes" : "No");
    }

}
