package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //given
        Book book1 = new Book("Title1", "Kowalski",2010,5,2);
        Book book2 = new Book("Title2", "Nowak", 2000, 3, 1);
        Book book3 = new Book("Title3", "Jurand", 1610, 11,15);

        Library library = new Library("nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("nr 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
