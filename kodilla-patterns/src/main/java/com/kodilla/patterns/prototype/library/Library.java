package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String toString() {
        String s = "   Books collection [" + name + "]";
        for (Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            clonedLibrary.getBooks().add(theBook);
        }

        return clonedLibrary;
    }
}
