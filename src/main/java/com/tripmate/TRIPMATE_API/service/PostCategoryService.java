package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.PostCategoryDto;
import java.util.List;

public interface PostCategoryService {
    void createCategory(PostCategoryDto newCategory);

    void updateCategoryName(String category_name, String values);

    List<PostCategoryDto> getCategories();

    void deleteCategory(String category_name);
}
