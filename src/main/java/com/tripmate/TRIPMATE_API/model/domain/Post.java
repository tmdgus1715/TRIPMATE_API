package com.tripmate.TRIPMATE_API.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Integer Id;
    private Integer type;
    private Integer like_count;
    private String posted_at;
    private String updated_at;
    private String deleted_at;
    private Integer is_valid;
    private String content;
    private String title;
    private Integer hit;
    private Integer user_id;
    private Integer category_id;
    private Integer tourist_attraction_id;
}
