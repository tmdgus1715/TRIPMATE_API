package com.tripmate.TRIPMATE_API.controller;


import com.tripmate.TRIPMATE_API.model.domain.TravelCategory;
import com.tripmate.TRIPMATE_API.service.TravelCategoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.net.URISyntaxException;
@RestController
@RequestMapping("/travel_categories")
@RequiredArgsConstructor
public class TravelCategoryController {
    private final TravelCategoryService touristAttractionCategoryService;

    @PostMapping // 카테고리 새로 만들기
    public ResponseEntity<Object> createCategory(@RequestBody TravelCategory newCategory) throws URISyntaxException {
        touristAttractionCategoryService.createCategory(newCategory);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}") // 카테고리 업데이트하기
    public ResponseEntity<Object> updateCategory(@PathVariable Integer id, @RequestBody TravelCategory postCategory) {
        touristAttractionCategoryService.updateCategoryName(id, postCategory);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list") // 카테고리 보여주기
    public ResponseEntity<List<TravelCategory>> getCategories() {
        List<TravelCategory> touristAttractionCategories = touristAttractionCategoryService.getCategories();
        return ResponseEntity.ok(touristAttractionCategories);
    }

    @DeleteMapping("/{id}") // 카테고리 지우기
    public ResponseEntity<Object> deleteCategory(@PathVariable Integer id) {
        touristAttractionCategoryService.deleteCategory(id);
        return ResponseEntity.ok().build();
    }
}