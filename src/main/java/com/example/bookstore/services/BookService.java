package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Book;
import com.example.bookstore.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepo;

    public List<Book> findAll(){
        return bookRepo.findAll();
    }

    public Book findById(Long id){
        return bookRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Book save(Book book){
        return bookRepo.save(book);
    }

    public void deleteById(Long id){
        bookRepo.deleteById(id);
    }
    
}
