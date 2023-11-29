package com.example.example3.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.example3.entity.Oder;
import com.example.example3.service.OderService;
import com.example.example3.repository.OderRepository;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OderServiceImpl implements OderService {

    private OderRepository categoryRepository;

    @Override
    public Oder createCategory(Oder category) {
        return categoryRepository.save(category);
    }

    @Override
    public Oder getCategoryById(Long categoryId) {
        Optional<Oder> optionalCategory = categoryRepository.findById(categoryId);
        return optionalCategory.get();
    }

    @Override
    public Page<Oder> getAllUser(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Oder updateCategory(Oder category) {
        Oder existingCategory = categoryRepository.findById(category.getId()).get();
        // existingCategory.setTitle(category.getTitle());
        // existingCategory.setDescription(category.getDescription());
        // existingCategory.setProducts(category.getProducts());
        Oder updatedCategory = categoryRepository.save(existingCategory);
        return updatedCategory;
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
