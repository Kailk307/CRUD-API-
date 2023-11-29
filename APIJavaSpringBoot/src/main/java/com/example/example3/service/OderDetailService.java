package com.example.example3.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.example3.entity.OderDetail;

public interface OderDetailService {
    
    // public OderDetail createCategory(OderDetail category);
    public List<OderDetail> createCategories(List<OderDetail> categories);
    public OderDetail getCategoryById(Long categoryId);
    public Page<OderDetail> getAllUser(Pageable pageable);
    public OderDetail updateCategory(OderDetail category);
    public void deleteCategory(Long categoryId);
}
