package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.TravelCategory;
import com.tripmate.TRIPMATE_API.repository.TravelCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TravelCategoryServiceImpl implements TravelCategoryService {
    private final TravelCategoryMapper travelCategoryMapper;

    @Override
    public void createCategory(TravelCategory newCategory) {
        travelCategoryMapper.createCategory(newCategory);
    }

    @Override
    public void updateCategoryName(Integer id, TravelCategory touristAttractionCategory) {
        travelCategoryMapper.updateCategoryName(id, touristAttractionCategory);
    }

    @Override
    public List<TravelCategory> getCategories() {
        List<TravelCategory> list = travelCategoryMapper.getCategories();
        return list;
    }

    @Override
    public void deleteCategory(Integer id) {
        travelCategoryMapper.deleteCategory(id);
    }
}
