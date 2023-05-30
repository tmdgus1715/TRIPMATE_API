package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.TouristAttraction;
import com.tripmate.TRIPMATE_API.repository.TouristAttractionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TouristAttractionServiceImpl implements TouristAttractionService {

    TouristAttractionMapper touristAttractionMapper;

    @Override
    public void createTouristAttraction(TouristAttraction newTouristAttraction) {
        touristAttractionMapper.createTouristAttraction(newTouristAttraction);
    }

    @Override
    public TouristAttraction getTouristAttraction(Integer id) {
        return touristAttractionMapper.getTouristAttraction(id);
    }

    @Override
    public List<TouristAttraction> getTouristAttractions() {
        return touristAttractionMapper.getTouristAttractions();
    }

    @Override
    public List<TouristAttraction> getTouristAttracionsOfTravelCategory(List<Integer> travelCategories) {
        return touristAttractionMapper.getTouristAttractionsOfTravelCategory(travelCategories);
    }

    @Override
    public void updateTouristAttraction(Integer id, TouristAttraction touristAttraction) {
        touristAttractionMapper.updateTouristAttraction(id, touristAttraction);
    }

    @Override
    public void deleteTouristAttraction(Integer id) {
        touristAttractionMapper.deleteTouristAttraction(id);
    }
}
