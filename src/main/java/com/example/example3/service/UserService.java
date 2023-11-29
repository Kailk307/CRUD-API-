package com.example.example3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.example3.entity.User;

public interface UserService {
    
    public User createCategory(User category);
    public User getCategoryById(Long categoryId);
    public Page<User> getAllUser(Pageable pageable);
    public User updateCategory(User category);
    public void deleteCategory(Long categoryId);
}
