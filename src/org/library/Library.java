package org.library;

/**
 * @author Protsko D.
 *         19.06.2017
 */
public class Library {

    private String name;
    private String address;
    private Book[] books;

    public Library() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String resultString = "Library \"" + name + "\", address: " + address + ". Books:";
        for (Book book: books) {
            resultString += "\n" + book.toString();
        }
        return resultString;
    }
}