package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library libraryBasic = new Library("Library one");
        libraryBasic.getBooks().add(new Book("Rock", "Lina Kova", LocalDate.of(2017, Month.MAY, 15)));
        libraryBasic.getBooks().add(new Book("Funky", "Soi Fiesses", LocalDate.of(2000, Month.JANUARY, 29)));
        Assert.assertEquals(2, libraryBasic.getBooks().size());

        Library libraryCopy1 = null;

        try {
            libraryCopy1 = libraryBasic.shallowCopy();
            libraryCopy1.setName("Library two");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        libraryBasic.getBooks().stream().forEach(n -> {
            System.out.println(n.getTitle() + "\n" + n.getAuthor() + "\n" + n.getPublicationDate());
        });

        libraryCopy1.getBooks().stream().forEach(n -> {
            System.out.println(n.getTitle() + "\n" + n.getAuthor() + "\n" + n.getPublicationDate());
        });


        Library libraryCopy2 = null;
        try {
            libraryCopy2 = libraryBasic.deepCopy();
            libraryCopy2.setName("Library third");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        libraryCopy2.getBooks().add(new Book("Bak", "Dole Roijhggg", LocalDate.of(2017, Month.APRIL, 30)));

        Assert.assertEquals(2, libraryBasic.getBooks().size());
        Assert.assertEquals(2, libraryCopy1.getBooks().size());
        Assert.assertEquals(3, libraryCopy2.getBooks().size());
    }
}
