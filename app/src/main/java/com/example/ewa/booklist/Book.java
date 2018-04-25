package com.example.ewa.booklist;

import java.io.Serializable;

public class Book implements Serializable {

    private String title;
    private String author;
    private Integer isbn;

    public Book(String title, String author, Integer isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getIsbn() {
        return isbn;
    }
}
