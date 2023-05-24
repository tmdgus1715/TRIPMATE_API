package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.PostCategory;
import com.tripmate.TRIPMATE_API.model.PostCategoryDto;
import com.tripmate.TRIPMATE_API.repository.PostCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostCategoryServiceImpl implements PostCategoryService {
    private final PostCategoryMapper postCategoryMapper;

    @Override
    public void createCategory(PostCategory newCategory) {
        postCategoryMapper.createCategory(newCategory);
    }

    @Override
    public void updateCategoryName(Integer id, PostCategory postCategory) {
        postCategoryMapper.updateCategoryName(id, postCategory);
    }

    @Override
    public List<PostCategory> getCategories() {
        List<PostCategory> list = postCategoryMapper.getCategories();
        return list;
    }

    @Override
    public void deleteCategory(Integer id) {
        postCategoryMapper.deleteCategory(id);
    }
}