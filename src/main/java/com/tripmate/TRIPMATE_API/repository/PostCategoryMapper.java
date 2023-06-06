package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.PostCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface PostCategoryMapper {
    public void createCategory(PostCategory newCategory);

    ArrayList<PostCategory> getCategories();

    void updateCategoryName(@Param("id") Integer id, PostCategory postCategory);

    void deleteCategory(Integer id);
}

