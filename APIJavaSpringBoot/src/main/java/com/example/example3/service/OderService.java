package com.example.example3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.example3.entity.Oder;

public interface OderService {
    
    public Oder createCategory(Oder category);
    public Oder getCategoryById(Long categoryId);
    public Page<Oder> getAllUser(Pageable pageable);
    public Oder updateCategory(Oder category);
    public void deleteCategory(Long categoryId);
}
