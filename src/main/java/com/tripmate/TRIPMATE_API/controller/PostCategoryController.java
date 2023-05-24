package com.tripmate.TRIPMATE_API.controller;


import com.tripmate.TRIPMATE_API.service.PostCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tripmate.TRIPMATE_API.model.PostCategoryDto;

import java.util.List;
import java.net.URISyntaxException;

public class PostCategoryController {
//    private final PostCategoryService postcategoryservice;
    private PostCategoryService postcategoryservice;

    @PostMapping // 카테고리 새로 만들기
    public ResponseEntity<Object> createCategory(@RequestBody PostCategoryDto newCategory) throws URISyntaxException {
        PostCategoryService.createCategory(newCategory);
//        return ResponseEntity.created(new URI("http://localhost:8080/categories/list")).build();
    }

    @PatchMapping("/{category_Name}") // 기존 카테고리에 추가하기
    public ResponseEntity<Object> updateCategory(@PathVariable String category_Name, @RequestBody UpdateRequestDto updateRequestDto) {
        switch (updateRequestDto.getKey()) {
            case "name":
                updateCategoryName(category_Name, updateRequestDto.getValue());
                return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<PostCategoryDto>> getCategories() {
        List<PostCategoryDto> categoryDtos = categoryService.getCategories();
        return ResponseEntity.ok(categoryDtos);
    }

    @DeleteMapping("/{category_Name}")
    public ResponseEntity<Object> deleteCategory(@PathVariable String category_Name) {
        categoryService.deleteCategory(category_Name);
        return ResponseEntity.ok().build();
    }
}