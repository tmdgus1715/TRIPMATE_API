package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.TravelCategory;

import java.util.List;

public interface TravelCategoryService {
    void createCategory(TravelCategory newCategory);

    void updateCategoryName(Integer id, TravelCategory touristAttractionCategory);

    List<TravelCategory> getCategories();

    void deleteCategory(Integer id);
}
