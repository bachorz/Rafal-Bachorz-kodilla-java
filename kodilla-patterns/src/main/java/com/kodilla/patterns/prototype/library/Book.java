package com.kodilla.patterns.prototype.library;

import java.time.*;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;

    public Book(final String title, final String author, int yearOfPublication,  int monthOfPublication, int dayOfPublication ) {
        this.title = title;
        this.author = author;
        this.publicationDate = LocalDate.of(yearOfPublication, monthOfPublication, dayOfPublication);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", publicationDate: " + publicationDate;
    }
}
