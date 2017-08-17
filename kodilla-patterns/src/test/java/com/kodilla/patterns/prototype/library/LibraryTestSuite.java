package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooksWithShallowClone() {
        //Given
        Library library = new Library("library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(2001, 1, 1))));

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
    }

    @Test
    public void testGetBooksWithDeepClone() {
        //Given
        Library library = new Library("library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(2001, 1, 1))));

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println("e");
        }

        //When
        library.getBooks().add(new Book("title6", "author6", LocalDate.of(2001, 1, 1)));
        //Then
        System.out.println(library);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(6,library.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());
    }
}