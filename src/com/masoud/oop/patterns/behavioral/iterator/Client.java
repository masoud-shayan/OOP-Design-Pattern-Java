package com.masoud.oop.patterns.behavioral.iterator;

import com.masoud.oop.patterns.behavioral.iterator.a.Iterator;
import com.masoud.oop.patterns.behavioral.iterator.c.Book;
import com.masoud.oop.patterns.behavioral.iterator.c.Library;

public class Client {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));


        // Using the Iterator to loop through the books in the Library
        Iterator<Book> iterator = library.getIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
