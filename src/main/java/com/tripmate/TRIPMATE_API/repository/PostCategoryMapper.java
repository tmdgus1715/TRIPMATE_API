package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.PostCategory;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface PostCategoryMapper {
    public void createCategory(PostCategory newCategory);

    public PostCategory getCategory(Integer id);

    PostCategory getCategoryByName(String categoryName);

    ArrayList<PostCategory> getCategories();

    void updateCategoryName(@Param("id") Integer id, PostCategory postCategory);

    void deleteCategory(Integer id);
}

