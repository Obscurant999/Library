package org.library;

import java.util.Date;

/**
 * @author Protsko D.
 *         19.06.2017
 */
public class Book {

    private long isbn;
    private String author;
    private String name;
    private Date releaseYear;

    public Book() {}

    public Book(long isbn, String author, String name, Date releaseYear) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "\tBook. ISBN: " + isbn + ", name: " + name + ", author: " + author + ", year of release: " + releaseYear;
    }
}