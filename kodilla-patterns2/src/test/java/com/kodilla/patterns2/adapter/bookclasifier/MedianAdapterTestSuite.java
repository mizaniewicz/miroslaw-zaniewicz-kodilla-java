package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("author1", "title1", 1990, "1"));
        books.add(new Book("author2", "title2", 2000, "2"));
        books.add(new Book("author3", "title3", 2000, "3"));
        books.add(new Book("author4", "title4", 2015, "4"));
        books.add(new Book("author5", "title5", 2015, "5"));
        //When
        int median = medianAdapter.publicationYearMediana(books);
        //Then
        assertEquals(2000, median);
    }
}