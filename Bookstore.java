import java.util.*;


public class Bookstore {
    private static List<Book> Books = new ArrayList<Book>();
    
    public static void addbooks() {

        Book book1 = new Book("Notre-Dame de Paris", "Victor Marie Hugo", 940, "Gosselin", 78);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 266, "T Egerton Whitehall", 81);
        Book book3 = new Book("Wuthering Heights", "Emily Brontë", 416, "Thomas Cautley Newby", 46);
        
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
    }

    public static String printAll() {
        String booklist= "<html>Show book lists:<br/>";
        addbooks(); 
        for (Book book : Books) {
            booklist = booklist.concat(book.print());
            booklist = booklist.concat("<br/><br/>");
        }
        booklist = booklist.concat("</html>");
        return booklist;
    }

    public static String printTXT() {
        String booklist= "Show book lists: \n";
        addbooks(); 
        for (Book book : Books) {
            booklist = booklist.concat(book.printTxt());
        }
        return booklist;
    }

    public static String Search(String title) {
        String booklist= "<html>";
        addbooks(); 
        for (Book book : Books) {
            if(book.getTitle().equals(title)) {
                booklist = booklist.concat(book.print());
            }
        }
        booklist = booklist.concat("<html/>");
        if (booklist.equals("<html><html/>")) {
            return "-1";
        }
        else
            return booklist;
    }

    public static String Rent(String title) {
        String booklist= "";
        addbooks(); 
        for (Book book : Books) {
            if(book.getTitle().equals(title)) {
                int stock = book.getStock();
                book.setStock(stock - 1);
                booklist = booklist.concat(book.printTxt());
            }
        }
        if (booklist.equals("")) {
            return "-1";
        }
        else
            return booklist;
    }
}


