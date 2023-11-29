package com.example.example3.service.impl;

import lombok.AllArgsConstructor;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.example3.entity.OderDetail;
import com.example.example3.service.OderDetailService;
import com.example.example3.repository.OderDetailRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OderDetailServiceImpl implements OderDetailService {

    private OderDetailRepository categoryRepository;

    @Override
    // public OderDetail createCategory(OderDetail category) {
    //     return categoryRepository.save(category);
    // }
    public List<OderDetail> createCategories(List<OderDetail> categories) {
        return categoryRepository.saveAll(categories);
    }

    @Override
    public OderDetail getCategoryById(Long categoryId) {
        Optional<OderDetail> optionalCategory = categoryRepository.findById(categoryId);
        return optionalCategory.get();
    }

    @Override
    public Page<OderDetail> getAllUser(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public OderDetail updateCategory(OderDetail category) {
        OderDetail existingCategory = categoryRepository.findById(category.getId()).get();
        // existingCategory.setTitle(category.getTitle());
        // existingCategory.setDescription(category.getDescription());
        // existingCategory.setProducts(category.getProducts());
        OderDetail updatedCategory = categoryRepository.save(existingCategory);
        return updatedCategory;
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
