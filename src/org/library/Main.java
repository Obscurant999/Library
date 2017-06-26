package org.library;

import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Created by kano on 18.06.17.
 */
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Books book001 = new Books(148410L, "Stanley H. Twiddle.", "And then my hat is gone!", new GregorianCalendar());
        Books book002 = new Books(745673L, "Ph. J. Fry", "No reason why", new GregorianCalendar());
        Books book003 = new Books(362854L, "James Clavell", "26 Hitokiris of Satsuma", new GregorianCalendar());


        library.setName("Russian National Library");
        library.setAddress("Moskovsky prospect");
        library.addBook(book001);
        library.addBook(book002);
     //   library.addBook(book003);


        }


}
