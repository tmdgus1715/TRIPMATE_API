package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.PostCategory;
import com.tripmate.TRIPMATE_API.model.PostCategoryDto;
import com.tripmate.TRIPMATE_API.repository.PostCategoryMapper;

import java.util.ArrayList;
import java.util.List;

public class PostCategoryServiceImpl implements PostCategoryService {
    private final PostCategoryMapper postCategoryMapper;
//    private final CheckValidationService check;

    @Override
    public void createCategory(PostCategoryDto newCategoryDto) {
        check.checkValidationCategory(newCategoryDto);

        PostCategory newCategory = newCategoryDto.toEntity();

        PostCategoryMapper.createCategory(newCategory);
    }

    @Override
    public void updateCategoryName(String categoryName, String newName) {
        check.checkValidationCategoryName(newName);

        PostCategory category = PostCategoryMapper.getCategoryByName(categoryName);
        category.checkValidation();

        UpdateParameterDto categoryUpdateParameterDto = UpdateParameterDto.builder().id(category.getId()).value(newName).build();

        PostCategoryMapper.updateCategoryName(categoryUpdateParameterDto);
    }

    @Override
    public List<PostCategoryDto> getCategories() {
        List<PostCategory> list = PostCategoryMapper.getCategories();
        List<PostCategoryDto> categories = new ArrayList<>();//
        for (int i = 0; i < list.size(); ++i) {
            categories.add(i, new PostCategoryDto(list.get(i)));//
        }

        return categories;
    }

    @Override
    public void deleteCategory(String categoryName) {
        PostCategory category = PostCategoryMapper.getCategoryByName(categoryName);
        category.checkValidation();

        PostCategoryMapper.deleteCategory(category.getId());
    }
}