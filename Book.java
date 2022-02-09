import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int page;
    private String publisher;
    private int stock;

    public Book(String title, String author, int page, String publisher, int stock) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.publisher = publisher;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getStock() {
        return stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String print() {
        String books = "";
        books = "Title: " + getTitle() + "<br/>Author: " + getAuthor()
                + "<br/>Year: " + getPage() + "<br/>Publisher:" + getPublisher() + "<br/>Stock: "
                + getStock();
        return books;
        
    }

    public String printTxt() {
        String books = "";
        books = "\nTitle: " + getTitle() + "\nAuthor: " + getAuthor()
                + "\nYear: " + getPage() + "\nPublisher:" + getPublisher() + "\nStock: "
                + getStock();
        return books;
        
    }
}