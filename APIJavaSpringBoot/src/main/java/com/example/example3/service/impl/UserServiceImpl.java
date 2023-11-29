package com.example.example3.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.example3.entity.User;
import com.example.example3.service.UserService;
import com.example.example3.repository.UserRepository;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository categoryRepository;

    @Override
    public User createCategory(User category) {
        return categoryRepository.save(category);
    }

    @Override
    public User getCategoryById(Long categoryId) {
        Optional<User> optionalCategory = categoryRepository.findById(categoryId);
        return optionalCategory.get();
    }

    @Override
    public Page<User> getAllUser(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public User updateCategory(User category) {
        User existingCategory = categoryRepository.findById(category.getId()).get();
        // existingCategory.setTitle(category.getTitle());
        // existingCategory.setDescription(category.getDescription());
        // existingCategory.setProducts(category.getProducts());
        User updatedCategory = categoryRepository.save(existingCategory);
        return updatedCategory;
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
