package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.TouristAttractionCategory;

import java.util.List;

public interface TouristAttractionCategoryService {
    void createCategory(TouristAttractionCategory newCategory);

    void updateCategoryName(Integer id, TouristAttractionCategory touristAttractionCategory);

    List<TouristAttractionCategory> getCategories();

    void deleteCategory(Integer id);
}
