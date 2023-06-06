package com.tripmate.TRIPMATE_API.controller;


import com.tripmate.TRIPMATE_API.model.TouristAttractionCategory;
import com.tripmate.TRIPMATE_API.service.TouristAttractionCategoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.net.URISyntaxException;
@RestController
@RequestMapping("/tourist_attraction_categories")
@RequiredArgsConstructor
public class TouristAttractionCategoryController {
    private final TouristAttractionCategoryService touristAttractionCategoryService;

    @PostMapping // 카테고리 새로 만들기
    public ResponseEntity<Object> createCategory(@RequestBody TouristAttractionCategory newCategory) throws URISyntaxException {
        touristAttractionCategoryService.createCategory(newCategory);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}") // 카테고리에 게시물 추가하기
    public ResponseEntity<Object> updateCategory(@PathVariable Integer id, @RequestBody TouristAttractionCategory postCategory) {
        touristAttractionCategoryService.updateCategoryName(id, postCategory);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list") // 카테고리 보여주기
    public ResponseEntity<List<TouristAttractionCategory>> getCategories() {
        List<TouristAttractionCategory> postCategories = touristAttractionCategoryService.getCategories();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}") // 카테고리 지우기
    public ResponseEntity<Object> deleteCategory(@PathVariable Integer id) {
        touristAttractionCategoryService.deleteCategory(id);
        return ResponseEntity.ok().build();
    }
}