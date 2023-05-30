package com.tripmate.TRIPMATE_API.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class TouristAttraction {
    Integer id;
    String state;
    String city;
    String address;
    String name;
    String intro;
    String customerServiceCenter;
    String openTime;
    String closeTime;
    String dayOff;
    String url;
    String fee;
    String updatedAt;
    String touristAttractionsImageId;
}
