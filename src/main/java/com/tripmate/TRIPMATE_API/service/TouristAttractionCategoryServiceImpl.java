package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.TouristAttractionCategory;
import com.tripmate.TRIPMATE_API.repository.TouristAttractionCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TouristAttractionCategoryServiceImpl implements TouristAttractionCategoryService {
    private final TouristAttractionCategoryMapper touristAttractionCategoryMapper;

    @Override
    public void createCategory(TouristAttractionCategory newCategory) {
        touristAttractionCategoryMapper.createCategory(newCategory);
    }

    @Override
    public void updateCategoryName(Integer id, TouristAttractionCategory touristAttractionCategory) {
        touristAttractionCategoryMapper.updateCategoryName(id, touristAttractionCategory);
    }

    @Override
    public List<TouristAttractionCategory> getCategories() {
        List<TouristAttractionCategory> list = touristAttractionCategoryMapper.getCategories();
        return list;
    }

    @Override
    public void deleteCategory(Integer id) {
        touristAttractionCategoryMapper.deleteCategory(id);
    }
}
