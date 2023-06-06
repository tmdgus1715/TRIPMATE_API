package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.TouristAttractionCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface TouristAttractionCategoryMapper {
    public void createCategory(TouristAttractionCategory newCategory);

    public TouristAttractionCategory getCategory(Integer id);

    TouristAttractionCategory getCategoryByName(String categoryName);

    ArrayList<TouristAttractionCategory> getCategories();

    void updateCategoryName(@Param("id") Integer id, TouristAttractionCategory touristAttractionCategory);

    void deleteCategory(Integer id);
}
