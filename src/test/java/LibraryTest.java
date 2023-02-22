import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        book = new Book("marcus", "book", "comedy");

        library = new Library();
        library.add(book);

    }

    @Test
    public void CountBooks(){
        assertEquals(1, library.NumberOfBooksInLibrary());
    }

    @Test
    public void AddBookTest(){
        book1 = new Book("thomson", "book", "comedy");
        library.add(book1);
        assertEquals(2, library.NumberOfBooksInLibrary());
    }

    @Test
    public void CheckIfLibraryIsFullTest(){
        book1 = new Book("thomson", "book", "comedy");
        assertEquals("Book added to library", library.StockIsFull(book1));
    }

    @Test
    public void CheckIfLibraryIsFullAgainTest(){
        book1 = new Book("thomson", "book", "comedy");
        book2 = new Book("thomson", "book", "comedy");
        book3 = new Book("thomson", "book", "comedy");
        book4 = new Book("thomson", "book", "comedy");
        book5 = new Book("thomson", "book", "comedy");
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        assertEquals("Sorry, the library is full", library.StockIsFull(book1));
    }
}
