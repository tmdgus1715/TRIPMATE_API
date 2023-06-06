package com.tripmate.TRIPMATE_API.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TouristAttraction {
    Integer id;
    String state;
    String city;
    String address;
    String name;
    String intro;
    String customer_service_center;
    String open_time;
    String close_time;
    String day_off;
    String url;
    String fee;
    String updated_at;
    List<String> images;
    List<Integer> travel_categories;

    public void setForDB(TouristAttraction existed) {
        this.id = (this.id != null) ? this.id : existed.getId();
        this.state = (this.state != null) ? this.state : existed.getState();
        this.city = (this.city != null) ? this.city : existed.getCity();
        this.address = (this.address != null) ? this.address : existed.getAddress();
        this.name = (this.name != null) ? this.name : existed.getName();
        this.intro = (this.intro != null) ? this.intro : existed.getIntro();
        this.customer_service_center = (this.customer_service_center != null) ? this.customer_service_center : existed.getCustomer_service_center();
        this.open_time = (this.open_time != null) ? this.open_time : existed.getOpen_time();
        this.close_time = (this.close_time != null) ? this.close_time : existed.getClose_time();
        this.day_off = (this.day_off != null) ? this.day_off : existed.getDay_off();
        this.url = (this.url != null) ? this.url : existed.getUrl();
        this.fee = (this.fee != null) ? this.fee : existed.getFee();
        this.updated_at = (this.updated_at != null) ? this.updated_at : existed.getUpdated_at();
        this.images = (this.images != null) ? this.images : existed.getImages();
        this.travel_categories = (this.travel_categories != null) ? this.travel_categories : existed.getTravel_categories();
    }
}
