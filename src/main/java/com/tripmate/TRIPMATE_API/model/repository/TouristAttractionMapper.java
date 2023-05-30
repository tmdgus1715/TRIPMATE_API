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

    void updateTouristAttraction(Integer id, @Param("touristAttraction") TouristAttraction touristAttraction);

    void deleteTouristAttraction(Integer id);

}
