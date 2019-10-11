package com.kodilla.testing.library;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));

        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        assertEquals(4,theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfOneLibraryUser (){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> noBorrowedBooks = new ArrayList<Book>();
        List<Book> oneBorrowedBooks = generateListOfNBooks(1);
        List<Book> fiveBorrowedBooks = generateListOfNBooks(5);
        LibraryUser libraryUser1 = new LibraryUser("Emilia", "Traczyk", "1234");
        LibraryUser libraryUser2 = new LibraryUser("Anna", "Kwiatek", "2345");
        LibraryUser libraryUser3 = new LibraryUser("Robert", "Nowakk", "3456");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(noBorrowedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(oneBorrowedBooks);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(fiveBorrowedBooks);

        List<Book> listOfNoBooks = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> listOfOneBooks = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> listOfFiveBooks = bookLibrary.listBooksInHandsOf(libraryUser3);

        assertEquals(0, listOfNoBooks.size());
        assertEquals(1, listOfOneBooks.size());
        assertEquals(5, listOfFiveBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}
