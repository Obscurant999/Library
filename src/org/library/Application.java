package org.library;

import java.util.Date;

/**
 * @author Protsko D.
 *         19.06.2017
 */
public class Application {

    public static void main(String[] args) {

        Book first = new Book(493945L, "Fill S.", "Audit", new Date());
        Book second = new Book(68213L, "Sidd R.", "More", new Date());
        Book third = new Book(1542358L, "Siery A.", "Authentication", new Date());

        Book[] books = { first, second, third };

        Library library = new Library();

        library.setName("Russian National Library");
        library.setAddress("Moskovsky prospect");
        library.setBooks(books);

        System.out.println(library.toString());
    }

}