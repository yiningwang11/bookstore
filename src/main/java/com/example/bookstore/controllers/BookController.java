package com.example.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.entities.Book;
import com.example.bookstore.services.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        bookService.deleteById(id);
    }
}
