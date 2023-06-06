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

    private final TouristAttractionMapper touristAttractionMapper;

    @Override
    public void createTouristAttraction(TouristAttraction newTouristAttraction) {
        touristAttractionMapper.createTouristAttraction(newTouristAttraction);
        Integer newTouristAttractionId = touristAttractionMapper.getTouristAttractionByName(newTouristAttraction.getName());
        touristAttractionMapper.createTouristAttractionImages(newTouristAttractionId, newTouristAttraction.getImages());
        touristAttractionMapper.createTouristAttractionTravelCategories(newTouristAttractionId, newTouristAttraction.getTravel_categories());
    }

    @Override
    public TouristAttraction getTouristAttraction(Integer id) {
        TouristAttraction touristAttraction = touristAttractionMapper.getTouristAttraction(id);
        setReferenceField(touristAttraction);
        return touristAttraction;
    }

    private void setReferenceField(TouristAttraction touristAttraction) {
        touristAttraction.setImages(touristAttractionMapper.getTouristAttractionImages(touristAttraction.getId()));
        touristAttraction.setTravel_categories(touristAttractionMapper.getTravelCategories(touristAttraction.getId()));
    }

    @Override
    public List<TouristAttraction> getTouristAttractions() {
        List<TouristAttraction> touristAttractions = touristAttractionMapper.getTouristAttractions();
        touristAttractions.forEach(element -> setReferenceField(element));
        return touristAttractions;
    }

    @Override
    public List<TouristAttraction> getTouristAttracionsOfTravelCategory(List<Integer> travelCategories) {
        List<TouristAttraction> touristAttractions = touristAttractionMapper.getTouristAttractionsOfTravelCategory(travelCategories);
        touristAttractions.forEach(element -> setReferenceField(element));
        return touristAttractions;
    }

    @Override
    public void updateTouristAttraction(Integer id, TouristAttraction touristAttraction) {
        TouristAttraction existed = touristAttractionMapper.getTouristAttraction(id);
        touristAttraction.setForDB(existed);
        touristAttractionMapper.updateTouristAttraction(id, touristAttraction);
    }

    @Override
    public void deleteTouristAttraction(Integer id) {
        touristAttractionMapper.deleteTouristAttraction(id);
    }
}
