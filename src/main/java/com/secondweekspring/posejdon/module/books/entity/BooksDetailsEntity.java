package com.secondweekspring.posejdon.module.books.entity;

import javax.persistence.*;

@Entity
@Table (name ="books_details")
public class BooksDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String publisher;
    private String lang;

    public String getLang() {
        return lang;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public BooksDetailsEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public BooksDetailsEntity setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BooksDetailsEntity setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BooksDetailsEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }
}
