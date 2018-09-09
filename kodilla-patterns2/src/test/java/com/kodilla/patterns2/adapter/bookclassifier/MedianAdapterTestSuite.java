package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

     @Test
    public void publicationYearMedianTest (){

        //Given
        Book bookA1 = new Book ("Kowalski","Trylogia", 2000,"S//2018/0001");
        Book bookA2 = new Book ("Nowak", "Dziela Zebrane", 2001, "S/2018/0002");
        Book bookA3 = new Book ("Maliniak", "Tytuly Zakazane", 2005, "S/2018/0003");
        Book bookA4 = new Book ("Brzeczyszczykiewcz", "Fraszki", 1998, "S/2018/0004");
        Book bookA5 = new Book ("Dudowski", "Glebia Maysli", 2015, "S/2018/0005");
        Book bookA6 = new Book ("Morawski", "Tu i tam", 2016, "S/2018/0006");
        Book bookA7 = new Book ("Kolejny", "Tyul", 2008, "S/2018/0007");

        Set<Book> bookSetA = new HashSet<>();
        bookSetA.add(bookA1);
        bookSetA.add(bookA2);
        bookSetA.add(bookA3);
        bookSetA.add(bookA4);
        bookSetA.add(bookA5);
        bookSetA.add(bookA6);
        bookSetA.add(bookA7);

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSetA);

        //Then

        System.out.println(result);
        assertEquals(2005,result);


    }
}
