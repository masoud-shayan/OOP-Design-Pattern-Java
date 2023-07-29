package com.masoud.oop.patterns.behavioral.iterator.c;

import com.masoud.oop.patterns.behavioral.iterator.a.Iterator;
import com.masoud.oop.patterns.behavioral.iterator.b.Iterable;

import java.util.ArrayList;
import java.util.List;


// Library class representing a collection of books
public class Library implements Iterable<Book> {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();

    }

    public void addBook(Book book) {
        books.add(book);
    }


    @Override
    public Iterator<Book> getIterator() {


        return new Iterator<Book>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < books.size();
            }

            @Override
            public Book next() {
                Book book = books.get(index);
                index++;
                return book;
            }
        };
    }
}
