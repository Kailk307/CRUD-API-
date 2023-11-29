package com.example.example3.controller;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.example3.entity.OderDetail;
import com.example.example3.service.OderDetailService;

@RestController
@AllArgsConstructor
@RequestMapping("api/oderdetail")
@CrossOrigin(origins = "*", exposedHeaders = "Content-Range")

public class OderDetailController {

    private OderDetailService categoryService;

        @GetMapping
    public ResponseEntity<Page<OderDetail>> getAllCategorys(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "100") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<OderDetail> Categories = categoryService.getAllUser(pageable);
        return new ResponseEntity<>(Categories, HttpStatus.OK);
    }
    // Create Category REST API
    // @PostMapping
    // public ResponseEntity<OderDetail> createCategory(@RequestBody OderDetail category) {
    //     OderDetail savedCategory = categoryService.createCategory(category);
    //     return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    // }
    @PostMapping
    public ResponseEntity<List<OderDetail>> createCategories(@RequestBody List<OderDetail> categories) {
        List<OderDetail> savedCategories = categoryService.createCategories(categories);
        return new ResponseEntity<>(savedCategories, HttpStatus.CREATED);
    }
    // Get Category by id REST API
    // http://localhost:8080/api/Categories/1
    @GetMapping("{id}")
    public ResponseEntity<OderDetail> getCategoryById(@PathVariable("id") Long categoryId) {
        OderDetail category = categoryService.getCategoryById(categoryId);
        if (category != null) {
            return new ResponseEntity<>(category, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    // Delete Category REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>("Category successfully deleted!", HttpStatus.OK);
    }
}
