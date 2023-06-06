package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.domain.TouristAttraction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TouristAttractionMapper {

    void createTouristAttraction(TouristAttraction newTouristAttraction);

    TouristAttraction getTouristAttraction(Integer id);

    List<TouristAttraction> getTouristAttractions();

    List<TouristAttraction> getTouristAttractionsOfTravelCategory(List<Integer> travelCategories);

    void updateTouristAttraction(@Param("targetId") Integer targetId, @Param("tour") TouristAttraction touristAttraction);

    void deleteTouristAttraction(Integer id);

    Integer getTouristAttractionByName(String name);

    void createTouristAttractionImages(Integer id, @Param("images") List<String> images);

    void createTouristAttractionTravelCategories(Integer id, @Param("categories") List<Integer> travelCategories);

    List<String> getTouristAttractionImages(Integer id);

    List<Integer> getTravelCategories(Integer id);
}
