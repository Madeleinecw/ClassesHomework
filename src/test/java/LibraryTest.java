import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books books, booksone, bookstwo;

    @Before
    public void before(){
        library = new Library();
        books = new Books("Horror", "Carrie", "Stephen King");
        booksone = new Books("Classics", "Jane Eyre", "Charlotte Bronte");
        bookstwo = new Books("Sci Fi", "The Day Of The Triffids", "John Wyndham");
    }

    @Test
    public void canCountBooksInLibrary(){
        library.addBook(books);
        library.addBook(booksone);
        assertEquals(2, library.countCatalogue());
    }

}
