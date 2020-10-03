package com.secondweekspring.posejdon.module.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;


    @GetMapping("/rest/books/{id}")
    public BooksEntity getBook(@PathVariable Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    @GetMapping("/rest/books")
    public List<BooksEntity> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping("/rest/books")
    public BooksEntity newsBooks(@RequestBody BooksEntity booksEntity) {
        return booksRepository.saveAndFlush(booksEntity);
    }


    @PutMapping("/rest/books/{id}")
    public BooksEntity updateBooks(@PathVariable Long id, @RequestBody BooksEntity booksEntity) {
        return booksRepository.saveAndFlush(booksEntity.setId(id));
    }

    @DeleteMapping("/rest/books/{id}")
    public void deleteBooks(@PathVariable Long id) {
        booksRepository.deleteById(id);
    }
}
