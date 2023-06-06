package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.domain.TravelCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface TravelCategoryMapper {
    public void createCategory(TravelCategory newCategory);

    ArrayList<TravelCategory> getCategories();

    void updateCategoryName(@Param("id") Integer id, TravelCategory travelCategory);

    void deleteCategory(Integer id);
}
