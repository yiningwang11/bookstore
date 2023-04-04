package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Category;
import com.example.bookstore.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public List<Category> findAll(){
        return categoryRepo.findAll();
    }

    public Category findById(Long id){
        return categoryRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public void deleteById(Long id){
        categoryRepo.deleteById(id);
    }
    
}
