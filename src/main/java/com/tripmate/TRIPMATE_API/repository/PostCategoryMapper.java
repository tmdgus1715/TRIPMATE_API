package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.PostCategory;

import java.util.ArrayList;

public interface PostCategoryMapper {
    public void createCategory(PostCategory newCategory);

    public PostCategory getCategory(Integer id);

    PostCategory getCategoryByName(String categoryName);

    ArrayList<PostCategory> getCategories();

//    void updateCategoryName(UpdateParameterDto categoryUpdateParameterDto);

    void deleteCategory(Integer id);
}

