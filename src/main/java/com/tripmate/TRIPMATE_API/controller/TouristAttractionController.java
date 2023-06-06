package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.domain.TouristAttraction;
import com.tripmate.TRIPMATE_API.service.TouristAttractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/touristAttractions", produces = "application/json; charset=utf8")
@RequiredArgsConstructor
public class TouristAttractionController {
    private final TouristAttractionService touristAttractionService;

    @PostMapping
    public ResponseEntity<Object> createTouristAttraction(@RequestBody TouristAttraction newTouristAttraction) {
        touristAttractionService.createTouristAttraction(newTouristAttraction);
        return ResponseEntity.ok().build();
    }//o

    @GetMapping("/{id}")
    public ResponseEntity<Object> getTouristAttraction(@PathVariable Integer id) {
        TouristAttraction touristAttraction = touristAttractionService.getTouristAttraction(id);
        return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
    }//o

    @GetMapping("/list")
    public ResponseEntity<Object> getTouristAttractions() {
        List<TouristAttraction> touristAttractions = touristAttractionService.getTouristAttractions();
        return new ResponseEntity<>(touristAttractions, HttpStatus.OK);
    }//o

    @GetMapping("/list/filter")
    public ResponseEntity<Object> getTouristAttraction(@RequestBody List<Integer> travelCategories) {
        List<TouristAttraction> touristAttractions = touristAttractionService.getTouristAttracionsOfTravelCategory(travelCategories);
        return new ResponseEntity<>(touristAttractions, HttpStatus.OK);
    }//o

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateTouristAttraction(@PathVariable Integer id, @RequestBody TouristAttraction touristAttraction) {
        touristAttractionService.updateTouristAttraction(id, touristAttraction);
        return ResponseEntity.ok().build();
    }//o

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTouristAttraction(@PathVariable Integer id) {
        touristAttractionService.deleteTouristAttraction(id);
        return ResponseEntity.ok().build();
    }//o
}
