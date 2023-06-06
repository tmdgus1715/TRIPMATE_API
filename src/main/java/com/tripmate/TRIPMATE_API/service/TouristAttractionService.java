package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.TouristAttraction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TouristAttractionService {
    void createTouristAttraction(TouristAttraction newTouristAttraction);

    TouristAttraction getTouristAttraction(Integer id);

    List<TouristAttraction> getTouristAttractions();

    List<TouristAttraction> getTouristAttracionsOfTravelCategory(List<Integer> travelCategories);

    void updateTouristAttraction(Integer id, @Param("tour") TouristAttraction touristAttraction);

    void deleteTouristAttraction(Integer id);
}
