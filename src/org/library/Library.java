package org.library;

/**
 * Created by 057000-07165 on 26.06.2017.
 */
import java.util.ArrayList;

public class Library {

    private String name;
    private String address;
    private ArrayList bookList;

    public Library() {
        ArrayList bookList = new ArrayList();
    }

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

    public void addBook(Books bookN) {
        bookList.add(bookN);
    }
}
