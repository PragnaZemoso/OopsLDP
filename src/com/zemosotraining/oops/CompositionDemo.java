package com.zemosotraining.oops;

//Composition: the container obj Library CANNOT survive without Contained obj Book
import java.util.ArrayList;
import java.util.List;

// class book
class Book {

    public String title;
    public String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;
    }
}

// Library class contains list of books.
class Library {

    // reference to refer to list of books.
    private final List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    // Getting total number of books
    public List<Book> getTotalBooksInLibrary() {
        return books;
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        // Creating the Objects of Book class.
        Book b1 = new Book("Java", "Adam");
        Book b2 = new Book("C Basics", "Bruce");

        // Creating the list which contains the no. of books.
        List<Book> book = new ArrayList<Book>();
        book.add(b1);
        book.add(b2);

        Library library = new Library(book);

        List<Book> books = library.getTotalBooksInLibrary();
        for (Book bk : books) {

            System.out.println("Title : " + bk.title
                    + " and "
                    + " Author : " + bk.author);
        }
    }
}
