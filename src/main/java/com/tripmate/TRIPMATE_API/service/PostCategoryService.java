package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.PostCategory;

import java.util.List;

public interface PostCategoryService {
    void createCategory(PostCategory newCategory);

    void updateCategoryName(Integer id, PostCategory postCategory);

    List<PostCategory> getCategories();

    void deleteCategory(Integer id);
}
