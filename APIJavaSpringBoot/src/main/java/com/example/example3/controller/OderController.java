package com.example.example3.controller;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.example3.entity.Oder;
import com.example.example3.service.OderService;

@RestController
@AllArgsConstructor
@RequestMapping("api/oder")
@CrossOrigin(origins = "*", exposedHeaders = "Content-Range")

public class OderController {

    private OderService categoryService;

        @GetMapping
    public ResponseEntity<Page<Oder>> getAllCategorys(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "100") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Oder> Categories = categoryService.getAllUser(pageable);
        return new ResponseEntity<>(Categories, HttpStatus.OK);
    }
    // Create Category REST API
    @PostMapping
    public ResponseEntity<Oder> createCategory(@RequestBody Oder category) {
        Oder savedCategory = categoryService.createCategory(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    // Get Category by id REST API
    // http://localhost:8080/api/Categories/1
    @GetMapping("{id}")
    public ResponseEntity<Oder> getCategoryById(@PathVariable("id") Long categoryId) {
        Oder category = categoryService.getCategoryById(categoryId);
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
