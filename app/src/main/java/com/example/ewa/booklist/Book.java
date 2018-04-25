package com.example.ewa.booklist;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private String author;
    private String isbn13;

    public Book(String title, String author, String isbn13) {
        this.title = title;
        this.author = author;
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn13;
    }
}
