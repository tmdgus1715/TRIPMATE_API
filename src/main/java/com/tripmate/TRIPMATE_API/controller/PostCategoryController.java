package com.tripmate.TRIPMATE_API.controller;


import com.tripmate.TRIPMATE_API.model.domain.PostCategory;
import com.tripmate.TRIPMATE_API.service.PostCategoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.net.URISyntaxException;
@RestController
@RequestMapping("/post_categories")
@RequiredArgsConstructor
public class PostCategoryController {
    private final PostCategoryService postCategoryService;

    @PostMapping // 카테고리 새로 만들기
    public ResponseEntity<Object> createCategory(@RequestBody PostCategory newCategory) throws URISyntaxException {
        postCategoryService.createCategory(newCategory);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}") // 카테고리 업데이트하기
    public ResponseEntity<Object> updateCategory(@PathVariable Integer id, @RequestBody PostCategory postCategory) {
        postCategoryService.updateCategoryName(id, postCategory);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list") // 카테고리 보여주기
    public ResponseEntity<List<PostCategory>> getCategories() {
        List<PostCategory> postCategories = postCategoryService.getCategories();
        return ResponseEntity.ok(postCategories);
    }

    @DeleteMapping("/{id}") // 카테고리 지우기
    public ResponseEntity<Object> deleteCategory(@PathVariable Integer id) {
        postCategoryService.deleteCategory(id);
        return ResponseEntity.ok().build();
    }
}