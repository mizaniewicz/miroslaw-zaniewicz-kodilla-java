package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMediana(Set<BookA> bookASet) {
        if (bookASet.size() == 0) return 0;
        Map<BookSignature, Book> booksMap = null;
        for (BookA bookA : bookASet) {
            BookSignature signature = new BookSignature(bookA.getSignature());
            Book theBook = new Book(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
            booksMap.put(signature, theBook);
        }
        return medianPublicationYear(booksMap);
    }
}
