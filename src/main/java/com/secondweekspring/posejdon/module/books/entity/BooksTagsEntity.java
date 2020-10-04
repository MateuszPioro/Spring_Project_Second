package com.secondweekspring.posejdon.module.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "books_tags")
@JsonIgnoreProperties("book")
public class BooksTagsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "book_id")
    private BooksEntity book;
    private String value;

    public BooksEntity getBook() {
        return book;
    }

    public BooksTagsEntity setBook(BooksEntity book) {
        this.book = book;
        return this;
    }

    public String getValue() {
        return value;
    }

    public BooksTagsEntity setValue(String value) {
        this.value = value;
        return this;
    }

}
