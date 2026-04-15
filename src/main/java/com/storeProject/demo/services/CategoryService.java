package com.storeProject.demo.services;

import com.storeProject.demo.entities.Category;
import com.storeProject.demo.entities.Order;
import com.storeProject.demo.repositories.CategoryRepository;
import com.storeProject.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> fildAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
