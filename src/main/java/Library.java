import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;


    public Library(){
        this.books = new ArrayList<Book>();
    }

    public int NumberOfBooksInLibrary(){
        return this.books.size();
    }

    public void add(Book book){
        this.books.add(book);
    }

    public String StockIsFull(Book book) {
        String full;
        if (this.NumberOfBooksInLibrary() < 5) {
            this.books.add(book);
            return "Book added to library";
        } else {
            full = "Sorry, the library is full";
            return full;
        }
    }
}
